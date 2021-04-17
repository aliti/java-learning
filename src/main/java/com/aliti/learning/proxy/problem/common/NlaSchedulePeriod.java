package com.aliti.learning.proxy.problem.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NlaSchedulePeriod {

    private String id;
    private int period;
    private BigDecimal payment;

}
