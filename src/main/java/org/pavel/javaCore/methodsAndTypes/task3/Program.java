package org.pavel.javaCore.methodsAndTypes.task3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        // 1. Написать метод getLastDigit(int number), который принимает
        // на вход число,
        // а возвращает последнюю цифру этого числа.
        // 2. В методе main получить число, введенное с клавиатуры, затем
        // вызватьметод getLastDigit,
        // передав ему это число. Вывести на экран результат выполнения
        // метода.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();
        getLastDigit(number);

    }

    static void getLastDigit(int number) {

        int count = 0;
        int numberCopy = number;

        while (numberCopy > 0) {

            number = number % 10;
            numberCopy = numberCopy / 10;
            count++;

        }
        if (count != 1) {

            number = number % 10;
            System.out.println(number);

        } else {
            throw new RuntimeException("Число должно быть минимум из двух цифр");
        }
    }
}
