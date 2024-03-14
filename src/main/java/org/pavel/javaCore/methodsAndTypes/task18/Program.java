package org.pavel.javaCore.methodsAndTypes.task18;

import java.util.*;

/**
 * Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
 */
public class Program {
    private static final Random random = new Random();
    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 1, 5, 3, 3};
        System.out.println(Arrays.toString(removeElement2(array)));


    }
    public static int[] removeElement2(int[] array) {
        boolean isDuplicate = false;
        int count = 0;
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (array[i] == a[j]){
                    isDuplicate = true;
                }
            }
            if (!isDuplicate){
                a[count++] = array[i];
            } else {
                isDuplicate = false;
            }
        }
        int[] res = new int[count];
        for (int i = 0; i < res.length; i++) {
            res[i] = a[i];
        }
        return res;
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




