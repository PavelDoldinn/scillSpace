package org.pavel.javaCore.methodsAndTypes.task5;

import java.util.Scanner;

public class Program {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int limitOfNumbers = 5;
    public static void main(String[] args) {

        //1. Написать метод, принимающий на вход 5ти-значное число и возвращающий 3тю цифру.
        //2. При тестировании метода, число вводить с клавиатуры

        try {
            getThreeNumber();
        } catch (RuntimeException e) {
            System.out.println("Число должно быть пятизначным.");
        }

    }
    public static void getThreeNumber() {

        System.out.println("Введите пятизначное число.");
        int inputNumber = scanner.nextInt();

        checkNumber(inputNumber);
        System.out.println();
    }
    private static void checkNumber(int inputNumber) throws RuntimeException {

        int count = 0;
        int copyInputNumber1 = inputNumber;
        int copyInputNumber2 = inputNumber;

        while (copyInputNumber1 > 0) {

            copyInputNumber2 = copyInputNumber2 % 10;
            copyInputNumber1 = copyInputNumber1 / 10;
            count ++;
        }
        if (count != limitOfNumbers) {

            throw new RuntimeException();

        } else {
            getNumberCenter(inputNumber);
        }

    }
    private static void getNumberCenter (int inputNumber) {

        int centerNumber = inputNumber / 100 % 10;
        System.out.println(centerNumber);
    }
}













