package org.pavel.classesAndObjects.task8;

/**
 * Строки. Палиндром
 * Написать метод:
 * public boolean validPalindrome(String s) {
 * }
 * принимающий на вход слово и возвращающий true если слово является палиндромом.
 * Также метод должен вернуть true если удалить один из символов
 * Case 1:
 * Input: s = "aba"
 * Output: true
 * Case 2:
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * Case 3:
 * Input: s = "abc"
 * Output: false
 * Допущения:
 * 1 <= s.length <= 10^5
 * s consists of lowercase English letters.
 * Прислать в ответе метод и скрин  результатом теста трех случаев: Case 1-3
 * Обратите внимание на скорость работы и эффективность вашего алгоритма.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
