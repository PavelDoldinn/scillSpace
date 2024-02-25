package org.pavel.javaCore.methodsAndTypes.task15;

import java.util.Scanner;

/**
 * 1.Через System.in вводить:
 * - количество людей
 * - количество кусков в одной пицце
 * 2. Вывести на экран минимальное количество пицц, чтобы у всех было одинаковое
 * количество кусков и ни одного не осталось лишнего в коробке.
 */
public class Program {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        pizza();

    }
    public static void pizza() {
        System.out.println("Введите количество человек");
        int human = scanner.nextInt();
        System.out.println("Введите количество кусков пиццы");
        int pieces = scanner.nextInt();
        int copyPieces = pieces;
        int pizza = 1;

        while (human > 0) {
            pieces = copyPieces;
            pieces = pieces * pizza;
            if (pieces % human == 0) {
                break;
            }
            pizza++;
        }
        System.out.println("Результат " + pizza);
    }
}
