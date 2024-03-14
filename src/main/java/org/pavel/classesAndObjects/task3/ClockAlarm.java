package org.pavel.classesAndObjects.task3;

public class ClockAlarm extends Clock {

    private int alarmHours;
    private int alarmMinutes;
    private int alarmCount;

    public ClockAlarm(int alarmHours, int alarmMinutes) {
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
    }

    public String setAlarm(int hours, int minutes) {
        if (hours < 10 && minutes < 10) {
            return String.format("Время будильника установилась 0" + "%s : 0" + "%s", hours, minutes);
        } else if (hours < 10 && minutes >= 10) {
            return String.format("Время будильника установилась 0" + "%s : " + "%s", hours, minutes);
        } else if (hours >= 10 && minutes < 10) {
            return String.format("Время будильника установилась " + "%s : 0" + "%s", hours, minutes);
        } else {
            return String.format("Время будильника установилась %s : %s", hours, minutes);
        }

    }

    public String checkAlarm(int hours, int minutes) {
        String s = " ";
        if (hours == alarmHours && minutes == alarmMinutes) {
            return String.format("Chime %s", checkTimeCount(hours, minutes));
        } else if (minutes == 15) {
            return String.format("Chime %s", checkTimeCount(hours, minutes));
        } else if (minutes == 45) {
            return String.format("Chime %s", checkTimeCount(hours, minutes));
        } else if (minutes == 30) {
            return String.format("Chime %s", checkTimeCount(hours, minutes));
        } else {
            return s;
        }

    }

    public int checkTimeCount(int hours, int minutes) {
        if (hours == alarmHours && minutes == alarmMinutes) {
            if (hours > 12) {
                alarmCount = hours - 12;
                return alarmCount;
            } else {
                alarmCount = hours;
                return alarmCount;
            }
        } else if (minutes == 15) {
            alarmCount += 1;
            return alarmCount;
        } else if (minutes == 30) {
            alarmCount += 1;
            return alarmCount;
        } else if (minutes == 45) {
            alarmCount += 1;
            return alarmCount;
        } else {
            alarmCount = 0;
            return alarmCount;
        }
    }
}
//public class ClockAlarm {
//
//    private int chime;
//    private int chimeHours;
//    private int chimeMinutes;
//
//
//
//    public String setAlarmTime(int alarmHours, int alarmMinutes){
//        if (alarmHours <= 9 && alarmMinutes <= 9){
//            return String.format("Время будильнтка установилось 0"+"%s"+" : "+"0"+"%s", alarmHours, alarmMinutes);
//        } else if (alarmHours <= 9 && alarmMinutes > 9){
//            return String.format("Время будильнтка установилось 0" + "%s" + " : " + "%s", alarmHours, alarmMinutes);
//        } else if (alarmHours > 9 && alarmMinutes <= 9){
//            return String.format ("Время будильнтка установилось %s" + " : " + "0" + "%s", alarmHours, alarmMinutes);
//        } else {
//            return String.format("Время будильнтка установилось %s : %s", alarmHours, alarmMinutes);
//        }
//    }
//    public String checkAlarm(int hours, int minutes){
//        getChime(hours, minutes);
//        if (hours > 12 && minutes == 0){
//            chime = hours - 12;
//        }
//        if (hours == Program.alarmHours && minutes == Program.alarmMinutes){
//            return String.format("Будильник сработает %s раз", chime);
//        } else if (hours == Program.alarmHours && minutes > Program.alarmMinutes) {
//            System.out.println("Звонить не надо.");
//            return String.format("Будильник сработает через %s ч." + " : " + "%s мин."
//                    , getGoChimeHours(), getGoChimeMinutes());
//        } else if (hours == Program.alarmHours && minutes < Program.alarmMinutes){
//            return String.format("Будильник сработает через %s ч." + " : " + "%s мин."
//                    , getGoChimeHours(), getGoChimeMinutes());
//        }
//        return null;
//    }
//    private int getGoChimeMinutes(){
//        chimeMinutes = 60;
//        int res = 0;
//        if (Program.minutes < Program.alarmMinutes){
//            res = chimeMinutes - (Program.alarmMinutes - Program.minutes);
//            return res;
//        } else if (Program.minutes > Program.alarmMinutes) {
//            res = chimeMinutes - (Program.minutes - Program.alarmMinutes);
//            return res;
//        } else {
//            return res;
//        }
//    }
//    private int getGoChimeHours(){
//        chimeHours = 24;
//        int res = 0;
//        if (Program.hours == 0 || Program.alarmHours == 0){
//            Program.hours = 24;
//            Program.alarmHours = 24;
//        }
//        if (Program.hours == Program.alarmHours){
//            return res - 1;
//        } else if (Program.hours < Program.alarmHours) {
//            res = chimeHours - (Program.alarmHours - Program.hours);
//            return res;
//        } else {
//            res = chimeHours - (Program.hours - Program.minutes);
//            return res;
//        }
//    }
//    private int getChime(int hours, int minutes) {
//
//        if (minutes == 15 || minutes == 30 || minutes == 45) {
//            return chime = 1;
//        }
//
//        return
//    }
//}
