package com.aliti.learning.proxy.poc.controller;

import com.aliti.learning.proxy.poc.model.NlaIdentifier;
import com.aliti.learning.proxy.poc.model.Schedule;
import com.aliti.learning.proxy.poc.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController()
@RequestMapping("/proxy")
public class ScheduleController {

  @Autowired private IScheduleService scheduleService;

  @GetMapping(value = "/generate_schedules/{activationGroupRevisionId}", produces = APPLICATION_JSON_VALUE)
  public Schedule generateSchedules(@PathVariable("activationGroupRevisionId") String activationGroupRevisionId) {
    return scheduleService.generateSchedule(new NlaIdentifier(activationGroupRevisionId));
  }

  @GetMapping(value = "/method2", produces = APPLICATION_JSON_VALUE)
  public void method2() {
    scheduleService.method2();
  }

  @GetMapping(value = "/method1", produces = APPLICATION_JSON_VALUE)
  public void method1() {
    scheduleService.method1();
  }

}
