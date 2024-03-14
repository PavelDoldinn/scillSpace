package org.pavel.javaCore.methodsAndTypes.task20;

import java.util.*;

import static java.lang.System.in;

/**
 * Массивы
 * 1. Получить через Scanner размер тестового массива
 * 2. Заполнить массив случайными целочисленными значениями
 * 3. Написать метод, удаляющий из массива локальные максимумы.
 * 4. Вывести на экран изначальный массив и массив после удаления локальных максимумов
 * Локальный максимум - элемент, который больше предыдущего и следующего, если элемент стоит в начале или в
 * конце массива, то больше только следующего или только предыдущего соответственно.
 * Пример:
 * Изначальный массив: [5, 3, -10, 4, -4, 80, 20]
 * После удаления локальных максимумов: [3, -10, -4, 20]
 */
public class Program {
    private static final Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt(21);
        int[] nums = new int[n];

        System.out.println(getNums(nums));
    }

    static List<Integer> getNums (int[] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] > nums[i +1]){
                    list.add(nums[i + 1]);
                } else {
                    list.add(nums[i]);
                }
            } else if (i == nums.length - 1) {
                if (nums[nums.length - 1] > nums[i - 1]){
                    list.add(nums[i - 1]);
                } {
                    list.add(nums[nums.length - 1]);
                }
            } else if(nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
                list.add(nums[i - 1]);
            }
        }
        return list;
    }
}





