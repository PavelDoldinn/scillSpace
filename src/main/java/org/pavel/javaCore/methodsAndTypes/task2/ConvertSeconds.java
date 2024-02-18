package org.pavel.javaCore.methodsAndTypes.task2;


import java.util.Scanner;

public class ConvertSeconds {

    private Scanner scanner = new Scanner(System.in);

    private int minutes;
    private int seconds;
    private int hours;
    private int days;
    private int weeks;
    private int secondScanner;


    public String getConvertSeconds() {

        if (getInputSeconds() <= 0) {

            throw new RuntimeException("Значение не может быть 0, или отрицательным");

        } else {

            weeks = secondScanner / 604800;
            days = secondScanner / 86400;
            hours = secondScanner / 3600;
            minutes = secondScanner / 60 % 60;
            seconds = secondScanner / 1 % 60;
            return String.format("Часы %d, Минуты %d, Секунды %d, Сутки %s, Недель %s",
                    hours, minutes, seconds, days, weeks);

        }
    }

    private int getInputSeconds() {

        System.out.println("Введите секунды");
        secondScanner = scanner.nextInt();

        return secondScanner;
    }
}
