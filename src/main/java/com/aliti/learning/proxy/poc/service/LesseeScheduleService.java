package com.aliti.learning.proxy.poc.service;

import com.aliti.learning.proxy.poc.model.LesseeSchedule;
import com.aliti.learning.proxy.poc.model.NlaIdentifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LesseeScheduleService extends ScheduleService {

  @Override public LesseeSchedule generateSchedule(NlaIdentifier identifier) {
    log.info("Lessee {}", identifier.getActivationGroupRevisionId());

    LesseeSchedule lessorSchedule = new LesseeSchedule();
    lessorSchedule.setSchedule(identifier.getActivationGroupRevisionId() + " LesseeSchedule");
    lessorSchedule.setLessee("Lessee");

    return lessorSchedule;
  }

  @Override public void method1() {
    log.info("method1 is called in LesseeScheduleService");
  }

}
