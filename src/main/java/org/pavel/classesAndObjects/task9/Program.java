package org.pavel.classesAndObjects.task9;

/**
 * Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
 * Например, если дана строка "string" результат будет "ri",
 * для строки "code" результат "od",
 * для "Practice" результат "ct".
 */
public class Program {
    public static void main(String[] args) {

        System.out.println(getMiddleChars("string"));
        System.out.println(getMiddleChars("code"));
        System.out.println(getMiddleChars("Practice"));
    }

    public static String getMiddleChars(String str) {
        int length = str.length();
        int middle = length / 2;
        return str.substring(middle - 1, middle + 1);
    }
}
