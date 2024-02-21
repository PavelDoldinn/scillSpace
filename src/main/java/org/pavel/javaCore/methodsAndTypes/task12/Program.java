package org.pavel.javaCore.methodsAndTypes.task12;

public class Program {

    public static void main(String[] args) {

        //Вычислить факториал целых чисел от 1 до 10 с помощью цикла while.

        System.out.println(getFactorial(10));
    }

    static int getFactorial(int n) {

        int count = 1;
        int factorial = 1;
        if (n <= 0) {

            return n;

        } else {

            while (n >= 1) {

                factorial = factorial * count;
                count++;
                n--;

            }
            return factorial;
        }

    }

}
