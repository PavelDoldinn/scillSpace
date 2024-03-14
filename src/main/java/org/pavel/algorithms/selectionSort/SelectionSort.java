package org.pavel.algorithms.selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public void getSelectionSort(int[] numbers) {

        int min;
        int tmp;
        for (int i = 0; i < numbers.length-1; i++) {
            min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }
            tmp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = tmp;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
