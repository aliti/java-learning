package com.aliti.learning.strategy.repo;

import com.aliti.learning.strategy.Context;
import com.aliti.learning.strategy.OperationAdd;
import com.aliti.learning.strategy.OperationSubstract;

public class StrategyPatternRepoDemo {

    public static void main(String[] args) {
        RepoContext context = new RepoContext("");
        System.out.println("10 + 5 = " + context.getDocRepo());
    }

}
