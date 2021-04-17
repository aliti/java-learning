package com.aliti.learning.proxy.problem.lessor;

import com.aliti.learning.proxy.problem.common.SchedulePeriodRepo;
import org.springframework.stereotype.Service;

@Service
public class LessorSchedulePeriodRepo extends SchedulePeriodRepo<String> {

    public String findById(){
        String result = "LessorSchedulePeriod::findById";
        System.out.println(result);
        return result;
    }

    public String findAll(){
        String result = "LessorSchedulePeriod::findAll";
        System.out.println(result);
        return result;
    }
}
