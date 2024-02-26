package org.pavel.javaCore.methodsAndTypes.task17;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Найдите максимальный элемент и выведите его индекс.
 */
public class Program {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > array[max]) {
                max = i;
            }
        }
        System.out.println(max);
    }

}
