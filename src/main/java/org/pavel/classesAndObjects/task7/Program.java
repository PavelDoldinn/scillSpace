package org.pavel.classesAndObjects.task7;

import java.util.Arrays;

/**
 * public boolean isPalindrome(String s) {
 * }
 * принимающий на вход фразу и возвращающий true если фраза является палиндромом.
 * Палиндром - фраза, которая при чтении справа на лево не меняет значения.
 * Пример - "шалаш", если перевернуть слово, то ничего не измениться.
 * Case 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Case 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Case 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters. Since an empty string reads
 * the same forward and backward, it is a palindrome.
 * Допущения:
 * 1 <= s.length <= 2 * 105
 * s
 * Прислать в ответе метод и скрин  результатом теста трех случаев: Case 1-3
 */
public class Program {

    public static void main(String[] args) {

        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome("A man, a plan, a canal: Panama."));
        System.out.println(isPalindrome.isPalindrome("race a car"));
        System.out.println(isPalindrome.isPalindrome(" "));


    }

}
