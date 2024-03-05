package org.pavel.algorithms.factorial;
import java.util.Scanner;

public class GetFactorial {

    private final Scanner scanner = new Scanner(System.in);
    private int number;
    private String inputNumber;
    private int numberFactorial = 1;

    private void enterNumber() {
        System.out.println("Введите число от которого хотите начти факториал: ");
        inputNumber = scanner.nextLine();
    }

    private void checkNumber() {
        enterNumber();

        try {
            number = Integer.parseInt(inputNumber);
        } catch (NumberFormatException e){
            System.out.println("Неверный формат, нужно ввести целое число, а не " + e);
        }
    }

    public int getFactorial(){
        checkNumber();
        if (number <= 0){
            System.out.println(number);
        } else {
            for (int i = 1; i <= number; i++) {
                numberFactorial *= i;
            }
        }
        return numberFactorial;
    }
}
