package org.pavel.javaCore.methodsAndTypes.task18;

import java.util.*;

/**
 * Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
 */
public class Program {
    private static final Random random = new Random();
    public static void main(String[] args) {

        removeElement1();
    }
    public static void removeElement1() {

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




