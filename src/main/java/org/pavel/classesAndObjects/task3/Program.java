package org.pavel.classesAndObjects.task3;

import java.util.Scanner;

/**
 * Создать класс Clock (Часы)
 * Задать поля alarmHours, alarmMinutes - время когда должен зазвонить будильник
 * Создать метод для установки будильника public String setAlarm(int hours, int minutes)
 * Метод проверяет на допустимость часы и минуты и в случае валидности устанавливает поля будильника.
 * Создать метод для проверки надо ли звонить сейчас public String checkAlarm(int hours, int minutes)
 * если входные параметры hours и minutes совпадают с временем установленным в поля alarmHours, alarmMinutes,
 * то метод возвращает “Chime” (звонок) либо “” (пустую строку) если будильник не сработал.
 * Часы должны звонить в 00 минут столько раз сколько часов, а также каждые 15 минут.
 * Написать метод public int checkTimeCount(int hours, int minutes).
 * Метод возвращает число сколько раз надо часам пробить. Например:
 * 17:15 вернуть 1 (звонить 1 раз),
 * 17:00 вернуть 5 (звонить 5 раз),
 * 17:01 вернуть 0 (не надо звонить)
 * Создать экземпляр часов, сделать проверки методов setAlarm, checkAlarm и checkTimeCount
 */
public class Program {

    private static Scanner scanner = new Scanner(System.in);
    protected static int hours;
    private static String hoursCopy;
    protected static int minutes;
    private static String minutesCopy;
    protected static int alarmHours;
    private static String alarmHoursCopy;
    protected static int alarmMinutes;
    private static String alarmMinutesCopy;

    private static boolean myException;


    public static void main(String[] args) {
        do {

            do {
                myException = false;
                System.out.println("Установите тякущее время: ");
                System.out.println("Введите тякущее часы: ");
                hoursCopy = scanner.nextLine();

                try {
                    hours = Integer.parseInt(hoursCopy);
                } catch (NumberFormatException e) {
                    System.out.println("Тякущее часы должны быть целым числом.");
                    myException = true;
                }
                if (hours > 24 || hours < 0) {
                    System.out.println("Тякущее часы должы быть от 0 до 24");
                    myException = true;
                }
                if (hours == 24) {
                    hours = 0;
                }
            } while (myException);

            do {
                myException = false;
                System.out.println("Введите тякущее минуты : ");
                minutesCopy = scanner.nextLine();
                try {
                    minutes = Integer.parseInt(minutesCopy);
                } catch (RuntimeException e) {
                    System.out.println("Тякущее Минуты должны быть целым числом: ");
                    myException = true;
                }
                if (minutes < 0 || minutes > 59) {
                    System.out.println("Тякущее минуты должны быть от 0 до 59");
                    myException = true;
                }
            } while (myException);

            do {
                myException = false;
                System.out.println("Установите часы будильника: ");
                alarmHoursCopy = scanner.nextLine();
                try {
                    alarmHours = Integer.parseInt(alarmHoursCopy);
                } catch (RuntimeException e) {
                    System.out.println("Часы будильника должны быть целым числом.");
                    myException = true;
                }
                if (alarmHours < 0 || alarmHours > 24) {
                    System.out.println("Часы будильника должны быть от 0 до 24");
                    myException = true;
                }
                if (alarmHours == 24) {
                    alarmHours = 0;
                }
            } while (myException);
            do {
                myException = false;
                System.out.println("Введите минуты будильника: ");
                alarmMinutesCopy = scanner.nextLine();
                try {
                    alarmMinutes = Integer.parseInt(alarmMinutesCopy);
                } catch (RuntimeException e) {
                    System.out.println("Минуты будильника должны быть целым числом.");
                    myException = true;
                }
                if (alarmMinutes < 0 || alarmMinutes > 59) {
                    System.out.println("Минуты будильника должны быть от 0 до 59");
                    myException = true;
                }
            } while (myException);
        } while (myException);

        Clock clockCurrentTime = new Clock(hours, minutes);
        System.out.println(clockCurrentTime.setCurrentTime(hours, minutes));

        ClockAlarm clockAlarm = new ClockAlarm(alarmHours, alarmMinutes);
        System.out.println(clockAlarm.setAlarm(alarmHours, alarmMinutes));
        System.out.println(clockAlarm.checkAlarm(hours, minutes));
    }
}













