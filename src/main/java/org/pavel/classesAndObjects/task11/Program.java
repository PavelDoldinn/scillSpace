package org.pavel.classesAndObjects.task11;

import java.util.Scanner;

/**
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что слова могут
 * разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getCountWords2());
    }

    public static String getCountWords() {
        int count = 0;
        System.out.println("Введите текст:");
        String string = scanner.nextLine();
        String trimReplaceAll[] = string.trim().replaceAll(" +", " ").split(" ");
        String join = String.join(" ", trimReplaceAll);
        for (String str : trimReplaceAll) {
            count++;
        }
        return String.format("В тексте %s %d слов.", join, count);
    }
    public static String getCountWords2(){
        System.out.println("Введите текст");
        String string =scanner.nextLine().trim().replaceAll(" +", " ");
        String[] words = string.split("\\s+");
        int countWord = words.length;
        return String.format("Количество слов %d", countWord);
    }
}
