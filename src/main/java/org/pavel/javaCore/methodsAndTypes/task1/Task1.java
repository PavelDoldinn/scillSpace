package org.pavel.javaCore.methodsAndTypes.task1;

import java.util.Scanner;

public class Task1 {

    private Scanner scanner = new Scanner(System.in);
    /*
     * Написать метод, который принимает на вход два целых числа, делает их
     * суммирование и складывает результат с произведением двух этих чисел, и
     * возвращает полученный результат из метода.
     * Передать на вход в метод любые два числа.
     * Вывести полученный результат работы метода на экран.
     */
    public void additionAndMultiplication() {

        int a = scannerNumber1();
        int b = scannerNumber2();
        int sum = addition(a, b);
        int multiplications = multiplication(a, b);
        int result = sum + multiplications;

        System.out.println(result);
    }
    private int addition (int a, int b) {
        int result1 = a + b;
        return result1;
    }
    private int multiplication(int a, int b) {
        int result2 = a * b;

        return result2;

    }
    private int scannerNumber1() {

        System.out.println("Введите первое число.");
        int number1 = scanner.nextInt();

        return number1;
    }
    private int scannerNumber2() {

        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();

        return number2;
    }

}
