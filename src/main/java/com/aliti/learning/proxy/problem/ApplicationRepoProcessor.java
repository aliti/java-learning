package com.aliti.learning.proxy.problem;

import com.aliti.learning.proxy.problem.common.PrincipalPositionType;
import com.aliti.learning.proxy.problem.common.SchedulePeriodRepo;
import com.aliti.learning.proxy.problem.lessee.LesseeSchedulePeriodRepo;
import com.aliti.learning.proxy.problem.lessor.LessorSchedulePeriodRepo;
import lombok.Getter;

@Getter
public class ApplicationRepoProcessor {

    public SchedulePeriodRepo schedulePeriodRepo;

    public ApplicationRepoProcessor(String activationGroupId) {

        PrincipalPositionType type = getTypeByAgId(activationGroupId);

        setJournalRepo(type);
        setScheduleRepo(type);
        setSchedulePeriodRepo(type);
    }

    private void setSchedulePeriodRepo(PrincipalPositionType type) {
        switch (type){
            case Lessee:
                schedulePeriodRepo = new LesseeSchedulePeriodRepo();
                break;
            case Lessor:
                schedulePeriodRepo = new LessorSchedulePeriodRepo();
                break;
        }
    }

    private void setScheduleRepo(PrincipalPositionType type) {
    }

    private void setJournalRepo(PrincipalPositionType type) {
    }

    private PrincipalPositionType getTypeByAgId(String activationGroupId) {
        if(activationGroupId.equalsIgnoreCase("lessor")) {
            return PrincipalPositionType.Lessor;
        } else if(activationGroupId.equalsIgnoreCase("lessee")) {
            return PrincipalPositionType.Lessee;
        }

        return null;
    }

}
