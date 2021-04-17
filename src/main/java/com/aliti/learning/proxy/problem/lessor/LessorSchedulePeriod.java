package com.aliti.learning.proxy.problem.lessor;

import com.aliti.learning.proxy.problem.common.NlaSchedulePeriod;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LessorSchedulePeriod extends NlaSchedulePeriod {

    private BigDecimal principalReceived;
    private BigDecimal interestReceived;
}
