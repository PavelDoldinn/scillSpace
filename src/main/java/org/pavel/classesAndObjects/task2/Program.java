package org.pavel.classesAndObjects.task2;

/**
 * Создайте класс, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
 * ○ Конструктор класса должен инициализировать эти два поля.
 * ○ Создайте метод класса, который будет выводить дробь в текстовой строке в формате x / y;
 * ○ Создайте метод, умножающий текущую дробь на число типа double, переданное методу в
 *   параметре и возвращающий дробь - результат умножения;
 * ○ Создайте метод, делящий текущую дробь на число типа double, переданное ему в параметре
 * и возвращающий дробь - результат деления.
 */
public class Program {
    public static void main(String[] args) {

        NumeratorAndDenominator numeratorAndDenominator1 = new NumeratorAndDenominator(2, 5);
        numeratorAndDenominator1.getNumeratorAndDenominator();
        numeratorAndDenominator1.multiplication(3);
        numeratorAndDenominator1.division(5);
    }
}
