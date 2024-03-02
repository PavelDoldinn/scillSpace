package org.pavel.javaCore.methodsAndTypes.task18;

import java.util.*;

/**
 * Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
 */
public class Program {
    private static final Random random = new Random();
    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 1, 5, 3, 3};

        removeElement2(array);
    }
    public static void removeElement2(int[] array) {

        int a = 0;

        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (a == array[i + 1]){
                System.out.print(a + " ");
                i++;
            }
        }

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




