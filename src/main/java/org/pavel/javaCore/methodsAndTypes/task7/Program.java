package org.pavel.javaCore.methodsAndTypes.task7;

public class Program {

    public static void main(String[] args) {

        //Создайте метод с одним целочисленным параметром.
        //Метод должен определить, является ли последняя
        //цифра числа семеркой и вернуть boolean значение.

        System.out.println(sevenTrueFalse(7233));
    }

    static boolean sevenTrueFalse(int number) {

        int finalNumber = 7;
        int res = number % 10;
        return res == finalNumber;
    }

}
