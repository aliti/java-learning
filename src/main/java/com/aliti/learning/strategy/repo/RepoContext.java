package com.aliti.learning.strategy.repo;

import com.aliti.learning.strategy.Strategy;

public class RepoContext {
    private String agId;

    public RepoContext(String agId){
        this.agId=agId;
    }

    public IDocRepo getDocRepo(){

        if(1==1){
            return new LesseeDocRepo() {
                @Override
                public int findById(String id) {
                    return 0;
                }
            };
        }

        return new LessorDocRepo() {
            @Override
            public int findById(String id) {
                return 0;
            }
        };
    }
}
