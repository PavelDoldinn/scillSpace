package org.pavel.classesAndObjects.task2;

public class NumeratorAndDenominator {
    /**
     * Числитель
     */
    private int x;
    /**
     * Знаменатель
     */
    private int y;

    public NumeratorAndDenominator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%d / %d", getX(), getY());
    }

    public void getNumeratorAndDenominator() {
        System.out.println(getX() + " / " + getY());
    }

    public void multiplication(double number) {
        double resMultiplication = (double) getX() / getY() * number;
        String qwerty = String.valueOf(resMultiplication);
        String[] str = qwerty.split("\\.");
        System.out.println(str[0] + " / " + str[1]);
    }

    public void division(double number) {
        double resDivision = (double) getX() / getY() / number;
        String qwerty = String.valueOf(resDivision);
        String[] str = qwerty.split("\\.");
        System.out.println(str[0] + " / " + str[1]);
    }
}
