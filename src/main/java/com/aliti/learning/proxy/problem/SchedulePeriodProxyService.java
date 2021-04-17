package com.aliti.learning.proxy.problem;

import org.springframework.stereotype.Service;

@Service
public class SchedulePeriodProxyService {

    public String createActivationGroup(String activationGroupId){
        return new ApplicationRepoProcessor(activationGroupId).getSchedulePeriodRepo().findById();
    }


}
