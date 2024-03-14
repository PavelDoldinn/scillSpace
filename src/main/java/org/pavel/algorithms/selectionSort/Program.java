package org.pavel.algorithms.selectionSort;

import java.util.Arrays;

/**
 * Сортировка выбором
 */
public class Program {
    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 3, 6, 7, 9, 4, 0, 4};
        System.out.println(Arrays.toString(arr));
        selectionSort.getSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
