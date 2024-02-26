package org.pavel.javaCore.methodsAndTypes.task18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
 */
public class Program {
    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(10);
        int[] numbers = new int[a];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));

        Set<Integer> integers = new HashSet<>();
        for (int i : numbers) {
            integers.add(i);
        }
        System.out.println(integers);
    }

}




