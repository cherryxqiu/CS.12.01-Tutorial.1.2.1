public class StepTracker {

    private int minimumSteps;
    private int days;
    private int activeDays;
    private int totalSteps;
    private int minActive;

    public StepTracker(int minimumSteps){
        this.minimumSteps = minimumSteps;
    }

    public double averageSteps(){
        if (days > 0) {
            return totalSteps / days;
        }
        else return 0;
    }

    public void addDailySteps(int steps) {
        days++;
        totalSteps += steps;
        if (steps >= minimumSteps) {
            activeDays++;
        }
    }


    public int activeDays() {
        return activeDays;
    }

    public int getStepsForActiveDay() {
        return minimumSteps;
    }

    public int getDays() {
        return days;
    }

    public int getActiveDays() {
        return activeDays;
    }

    public void setActiveDays(int activeDays) {
        this.activeDays = activeDays;
    }

    public void setMinActive(int minActive) {
        this.minActive = minActive;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setTotalSteps(int totalSteps) {
        this.totalSteps = totalSteps;
    }

    public int getMinActive() {
        return minActive;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

}
