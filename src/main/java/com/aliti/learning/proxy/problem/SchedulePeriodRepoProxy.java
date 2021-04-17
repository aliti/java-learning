package com.aliti.learning.proxy.problem;

import com.aliti.learning.proxy.problem.lessee.LesseeSchedulePeriodRepo;
import com.aliti.learning.proxy.problem.lessor.LessorSchedulePeriodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulePeriodRepoProxy {

    @Autowired
    LesseeSchedulePeriodRepo lesseeSchedulePeriodRepo;
    @Autowired
    LessorSchedulePeriodRepo lessorSchedulePeriodRepo;


}
