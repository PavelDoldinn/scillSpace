package org.pavel.classesAndObjects.task10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Регулярные выражения. Поиск знаков препинания.
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите строку:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(string);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Знаков препинания " + count);
    }
}
