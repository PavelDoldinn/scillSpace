package org.pavel.javaCore.methodsAndTypes.task6;

import java.util.Scanner;

public class Program {

    private static final Scanner scanner = new Scanner(System.in);
    private static double x1;
    private static double y1;
    private static double x2;
    private static double y2;

    public static void setX1(double x1) {
        Program.x1 = x1;
    }

    public static void setY1(double y1) {
        Program.y1 = y1;
    }

    public static void setX2(double x2) {
        Program.x2 = x2;
    }

    public static void setY2(double y2) {
        Program.y2 = y2;
    }

    public static double getX1() {
        return x1;
    }

    public static double getY1() {
        return y1;
    }

    public static double getX2() {
        return x2;
    }

    public static double getY2() {
        return y2;
    }

    public static void main(String[] args) {

        //Написать метод, принимающий на вход координаты двух точек и возвращающий длину отрезка между этими точками.
        //При тестировании координаты вводить с клавиатуры.
        //Подсказка: использовать класс Math и формулу расчета отрезка по координатам двух точек.

        System.out.println(getLength());

    }

    public static double getLength() {

        getConvertInputCoordinates();

        return Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
    }

    private static void getConvertInputCoordinates() {

        try {

            setX1(Double.parseDouble(inputCoordinates("Введите кординату X-1")));
            setY1(Double.parseDouble(inputCoordinates("Введите кординату Y-1")));
            setX2(Double.parseDouble(inputCoordinates("Введите кординату X-2")));
            setY2(Double.parseDouble(inputCoordinates("Введите кординатк Y-2")));
        } catch (RuntimeException e) {
            System.out.println("Нужно ввести число " + e.getMessage());
        }

    }

    private static String inputCoordinates(String message) {

        System.out.println(message);
        return scanner.nextLine();

    }


}
