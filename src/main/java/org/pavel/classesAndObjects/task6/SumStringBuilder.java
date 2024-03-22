package org.pavel.classesAndObjects.task6;

public class SumStringBuilder {
    public String getSumStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("asd");
        }
        long timeFinish = System.currentTimeMillis();
        long res = timeFinish - timeStart;
        return String.format("Выполнялось с StringBuilder %sмл.", res);
    }
}
