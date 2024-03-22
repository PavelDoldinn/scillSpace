package org.pavel.classesAndObjects.task5;

import java.util.Arrays;

/**
 * Строки. Методы класса String
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * 1) Распечатать последний символ строки. Используем метод String.charAt().
 * 2) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * 3) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * 4) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 * 5) Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * 6) Заменить все символы “а” на “о”.
 * 7) Преобразуйте строку к верхнему регистру.
 * 8) Вырезать строку "Java" c помощью метода String.substring().
 */
public class Program {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        String s1 = "Java";
        char c = 'a';

        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        indexS(s, s1);
        System.out.println(characterReplacement(s, c));
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0, 6) + " " + s.substring(11));
    }

    public static char[] characterReplacement(String s, char c) {
        char[] c2 = s.toCharArray();
        for (int i = 0; i < c2.length; i++) {
            if (c2[i] == c) {
                c2[i] = 'o';
            }
        }
        return c2;
    }

    public static void indexS(String s, String s1) {
        String[] copyS = s.split(" ");
        for (int i = 0; i < copyS.length; i++) {
            if (copyS[i].contains(s1)) {
                System.out.println(i);
            }
        }
    }
}
