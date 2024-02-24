package org.pavel.javaCore.methodsAndTypes.task8;

/**
 * Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */
public class Program {

    public static void main(String[] args) {

        closeRectangle(5,5,5);

    }
    static void closeRectangle(int a, int b, int r) {

        if (r * r >= (a * a + b * b) / 4){
            System.out.println("Закроется.");
        } else {
            System.out.println("Не закроется.");
        }
    }
}
