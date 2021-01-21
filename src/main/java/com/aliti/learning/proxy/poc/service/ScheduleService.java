package com.aliti.learning.proxy.poc.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ScheduleService implements IScheduleService {

  @Override public void method2() {
    log.info("method2 is called on ScheduleService");
  }

}
