package org.pavel.classesAndObjects.task3;

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

    public static void main(String[] args) {
        Clock clock = new Clock();


    }

}
