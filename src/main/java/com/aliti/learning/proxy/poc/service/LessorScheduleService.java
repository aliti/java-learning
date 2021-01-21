package com.aliti.learning.proxy.poc.service;

import com.aliti.learning.proxy.poc.model.LessorSchedule;
import com.aliti.learning.proxy.poc.model.NlaIdentifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LessorScheduleService extends ScheduleService {

  @Override public LessorSchedule generateSchedule(NlaIdentifier identifier) {
    log.info("Lessor {}", identifier.getActivationGroupRevisionId());

    LessorSchedule lessorSchedule = new LessorSchedule();
    lessorSchedule.setSchedule(identifier.getActivationGroupRevisionId() + " LessorSchedule");
    lessorSchedule.setLessor("Lessor");

    return lessorSchedule;
  }

  @Override public void method1() {
    log.info("method1 is called in LessorScheduleService");
  }

}
