package org.pavel.javaCore.methodsAndTypes.task20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LocalMaximum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив без локальных максимумов: ");
        System.out.println(Arrays.toString(removerLocalsMax(array)));

    }

    static int[] removerLocalsMax(int[] array) {
        int[] res = new int[array.length];
        int j = 0;
        if (array[j] < array[j + 1]){
            res[j++] = array[0];
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] || array[i] < array[i - 1]){
                res[j++] = array[i];
            }
        }
        if (array[array.length-1] < array[array.length - 2]){
            res[j++] = array[array.length-1];
        }
        return Arrays.copyOf(res, j);
    }
}
