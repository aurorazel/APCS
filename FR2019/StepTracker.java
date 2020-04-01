import java.util.*;

public class StepTracker{
    private int minSteps, totalSteps, activeDays, totalDays;
    public StepTracker(int mn) {minSteps=mn;}
    public void addDailySteps(int s){
        totalSteps+=s; totalDays++;
        if (s>=minSteps) activeDays++;
    }
    public int activeDays() {return activeDays;}
    public double averageSteps(){
        if (totalDays==0) return 0; 
        return (double)totalSteps/totalDays;
    }
}