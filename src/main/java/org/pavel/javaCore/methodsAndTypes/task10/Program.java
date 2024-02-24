package org.pavel.javaCore.methodsAndTypes.task10;

//Задать целое число в виде переменной, это число – сумма денег в рублях.
//Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
public class Program {

    public static void main(String[] args) {

        amountOfRubles(111);
    }

    static void amountOfRubles(int rubles) {

        int res = rubles % 100 / 10;
        if (res == 1) {
            System.out.println(rubles + " Рублей.");

        } else if (rubles % 10 == 1) {
            System.out.println(rubles + " Рубль.");
        } else if (rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4) {
            System.out.println(rubles + " Рубля.");
        } else {
            System.out.println(rubles + " Рублей.");
        }
    }
}
