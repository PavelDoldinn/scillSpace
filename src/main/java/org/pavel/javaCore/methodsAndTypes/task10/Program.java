package org.pavel.javaCore.methodsAndTypes.task10;

public class Program {

    public static void main(String[] args) {

        //Задать целое число в виде переменной, это число – сумма денег в рублях.
        //Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.

        amountOfRubles(0);
    }

    static void amountOfRubles(int rubles) {

        if (rubles == 1) {

            System.out.println(rubles + " Рубль.");

        } else if (rubles == 2 || rubles == 3 || rubles == 4) {
            System.out.println(rubles + " Рубля.");
        } else {
            System.out.println(rubles + " Рублей.");
        }

    }

}
