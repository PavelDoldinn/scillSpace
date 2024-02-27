package org.pavel.javaCore.methodsAndTypes.task19;
import java.util.Arrays;
/**
 * Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class Program {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = start; j < array[i].length - end; j++) {
                array[i][j] = 1;
            }
            if (i < array.length / 2) {
                start++;
                end++;
            } else {
                start--;
                end--;
            }
        }
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
