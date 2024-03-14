package org.pavel.algorithms.primeNumbers;

import java.util.Scanner;

/**
 * Выведет все простые числа от 0 до n
 */
public class GetPrimeNumbers {

    public void getPrimeNumbers(int number){

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
