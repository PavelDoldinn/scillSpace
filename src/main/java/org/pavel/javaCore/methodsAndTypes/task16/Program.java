package org.pavel.javaCore.methodsAndTypes.task16;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Выведите на экран элементы, стоящие на четных позициях.
 */
public class Program {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(51);
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
