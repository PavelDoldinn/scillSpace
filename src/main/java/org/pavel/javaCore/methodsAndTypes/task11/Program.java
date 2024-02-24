package org.pavel.javaCore.methodsAndTypes.task11;

import java.util.Scanner;

/**
 * Коэффициенты a,b,c квадратного уравнения (a*x)*2 + b*x + c = 0
 * задаются через System.in.
 * Надо вывести на экран один или два корня уравнения если они есть, иначе вывести на экран “Корней нет”.
 * Параметр a гарантированно не равен 0.
 */
public class Program {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        odds();

    }

    static void odds() {

        System.out.println("Введите значение a");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b");
        double b = scanner.nextDouble();

        System.out.println("Введите значение c");
        double c = scanner.nextDouble();

        double x1;
        double x2;
        double discrimenant = b * b - 4 * a * c;

        if (discrimenant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("x1 = x2 = %s", x1);

        } else if (discrimenant > 0) {
            x1 = (-b + Math.sqrt(discrimenant)) / (2 * a);
            x2 = (-b - Math.sqrt(discrimenant)) / (2 * a);
            System.out.printf("x1 = %s, x2 = %s", x1, x2);

        } else {
            System.out.println("Нет решения дискриминант < 0");
        }

    }

}
