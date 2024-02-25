package org.pavel.javaCore.methodsAndTypes.task8;

/**
 * Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */
public class Program {

    public static void main(String[] args) {

        closeRectangle(5,5,5);

    }
    static void closeRectangle(int a, int b, double r) {

        double gipotenuza = Math.sqrt(Math.pow(a, 2) + Math.pow(b , 2));
        if (r * 2 >= gipotenuza){
            System.out.println("Закроется.");
        } else {
            System.out.println("Не закроется.");
        }
    }
}
