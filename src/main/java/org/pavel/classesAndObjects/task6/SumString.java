package org.pavel.classesAndObjects.task6;

public class SumString {
    public String getSumString(String str) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "asd";
        }
        long timeFinish = System.currentTimeMillis();
        long res = timeFinish - timeStart;
        return String.format ("Склеивание строк выполнялось %sмл.",res);
    }
}
