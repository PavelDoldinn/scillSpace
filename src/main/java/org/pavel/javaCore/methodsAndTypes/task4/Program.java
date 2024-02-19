package org.pavel.javaCore.methodsAndTypes.task4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //1. Написать метод, принимающий на вход четырехзначное число abcd и возвращающий сумму ab + cd
        //2. Получать число abcd через scanner в методе main

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        calculateNumbers(number);

    }
    public static void calculateNumbers(int number) {
        checkNumber(number);
    }

    private static void checkNumber(int number) {

        int count = 0;
        int copyNumber1 = number;
        int copyNumber2 = number;

        while (copyNumber1 > 0) {

            copyNumber2 = copyNumber2 * 10 % 10;
            copyNumber1 = copyNumber1 / 10;
            count++;

        }
        if (count != 4) {
            throw new RuntimeException("Число должно быть четырехзначное а не " + count + " значение");
        } else {
            getSum(number);
        }

    }

    private static void getSum(int number) {

        int number12;
        int number34;
        int sum;

        number12 = number / 100;
        number34 = number % 100;
        sum = number12 + number34;

        System.out.println(sum);
    }
}













