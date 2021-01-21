package com.aliti.learning.proxy.poc.service;


import com.aliti.learning.proxy.poc.model.NlaIdentifier;
import com.aliti.learning.proxy.poc.model.Schedule;

public interface IScheduleService {

   Schedule generateSchedule(NlaIdentifier identifier);

   void method1();

   void method2();

}
