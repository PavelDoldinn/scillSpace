package org.pavel.classesAndObjects.task6;

/**
 * Строки. Сравнение скорости String и StringBuilder
 * Напишите два цикла выполняющих 100 000 сложений строк вида “aaabbbccc”, один с помощью оператора
 * сложения и String, а другой с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения.Выведите сравнение на экран.
 */
public class Program {
    public static void main(String[] args) {

        SumString string = new SumString();
        System.out.println(string.getSumString("asd"));

        SumStringBuilder stringBuilder = new SumStringBuilder();
        System.out.println(stringBuilder.getSumStringBuilder());
    }
}
