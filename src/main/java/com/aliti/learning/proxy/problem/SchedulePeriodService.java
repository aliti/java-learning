package com.aliti.learning.proxy.problem;

import com.aliti.learning.proxy.problem.lessee.LesseeSchedulePeriodRepo;
import com.aliti.learning.proxy.problem.lessor.LessorSchedulePeriodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulePeriodService {

    @Autowired
    LesseeSchedulePeriodRepo lesseeRepo;
    @Autowired
    LessorSchedulePeriodRepo lessorRepo;

    public String findAllSchedulesByActivationGroupId_Lessee(String activationGroupId) {
        return lesseeRepo.findById();
    }

    public String findAllSchedulesByActivationGroupId_Lessor(String activationGroupId) {
        return lessorRepo.findById();
    }

}
