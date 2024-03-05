package org.pavel.enumLec;

public enum Day {
    MONDAY(true, 8), TUESDAY(true, 8),
    WEDNESDAY(true,8), THURSDAY(true, 8),
    FRIDAY(true, 8),SATURDAY(false, 0), SUNDAY(false, 0);

    private boolean isWorkingDay;
    private int workingHours;
    Day(boolean isWorkingDay, int workingHours) {
        this.isWorkingDay = isWorkingDay;
        this.workingHours = workingHours;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        isWorkingDay = workingDay;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public static void main(String[] args) {

        for (Day day : Day.values()){
            System.out.println(day.name() + " " + day.isWorkingDay + " " + day.workingHours);
        }

    }
}
