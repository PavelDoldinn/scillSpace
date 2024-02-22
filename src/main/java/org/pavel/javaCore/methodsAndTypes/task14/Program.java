package org.pavel.javaCore.methodsAndTypes.task14;

/**
 * Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится
 * без остатка только на 1 и себя) и завершить цикл с  использованием break.
 */

public class Program {

    public static void main(String[] args) {

        getSecondPrimeNumber(50, 70);
    }

    static void getSecondPrimeNumber(int a, int b) {

        int count = 0;
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
            if (count == 2) {
                System.out.println(i);
                break;
            }
        }
    }
}











