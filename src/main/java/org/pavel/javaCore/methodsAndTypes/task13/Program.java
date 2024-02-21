package org.pavel.javaCore.methodsAndTypes.task13;

public class Program {

    public static void main(String[] args) {

        //Посчитать сумму цифр числа 7893823445 с помощью цикла do while.

        System.out.println(sumNumber("7893823445"));

    }

    public static long sumNumber(String inputNumber) {

        long copyInputNumber = Long.parseLong(inputNumber);
        long sum = 0;
        long delete;

        do {

            delete = copyInputNumber % 10;
            copyInputNumber = copyInputNumber / 10;
            sum = sum + delete;

        } while (copyInputNumber > 0);

        return sum;
    }

}
