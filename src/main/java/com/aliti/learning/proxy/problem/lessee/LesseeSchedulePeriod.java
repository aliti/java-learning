package com.aliti.learning.proxy.problem.lessee;

import com.aliti.learning.proxy.problem.common.NlaSchedulePeriod;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LesseeSchedulePeriod extends NlaSchedulePeriod {

    private BigDecimal principalPayable;
    private BigDecimal interestPayable;

}
