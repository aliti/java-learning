package com.aliti.learning.proxy.problem.lessee;

import com.aliti.learning.proxy.problem.common.SchedulePeriodRepo;
import org.springframework.stereotype.Service;

@Service
public class LesseeSchedulePeriodRepo extends SchedulePeriodRepo<LesseeSchedulePeriod> {

    public String findById(){
        String result = "LesseeSchedulePeriod::findById";
        System.out.println(result);
        return result;
    }

    public String findAll(){
        String result = "LesseeSchedulePeriod::findAll";
        System.out.println(result);
        return result;
    }
}
