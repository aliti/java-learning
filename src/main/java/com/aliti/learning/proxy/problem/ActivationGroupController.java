package com.aliti.learning.proxy.problem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ActivationGroupController {

    @Autowired
    SchedulePeriodService service;
    @Autowired
    SchedulePeriodProxyService proxyService;

    @GetMapping(value = "/{agId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String findAllSchedulesByActivationGroupId(@PathVariable("agId") String activationGroupId){

        if(activationGroupId.equalsIgnoreCase("lessee")) {
           return service.findAllSchedulesByActivationGroupId_Lessee(activationGroupId);
        } else if(activationGroupId.equalsIgnoreCase("lessor")) {
           return service.findAllSchedulesByActivationGroupId_Lessor(activationGroupId);
        }

        return "Nothing found";
    }

    @GetMapping(value = "/proxy/{agId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String findAllSchedulesByActivationGroupIdStrategy(@PathVariable("agId") String activationGroupId) {
        return proxyService.createActivationGroup(activationGroupId);
    }
}
