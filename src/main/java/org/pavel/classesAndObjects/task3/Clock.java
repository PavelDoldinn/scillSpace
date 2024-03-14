package org.pavel.classesAndObjects.task3;

public class Clock {

    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Clock() {

    }

    /**
     * Установит текущие время
     */
    public String setCurrentTime(int hours, int minutes) {
        if (hours < 10 && minutes < 10) {
            return String.format("Текущее время установилось 0" + "%s : 0" + "%s", hours, minutes);
        } else if (hours < 10 && minutes >= 10) {
            return String.format("Текущее время установилось 0" + "%s : %s", hours, minutes);
        } else if (hours >= 10 && minutes < 10) {
            return String.format("Текущее время установилось %s : " + "0" + "%s", hours, minutes);
        } else {
            return String.format("Текущее время установилось %s : %s", hours, minutes);
        }
    }

}
