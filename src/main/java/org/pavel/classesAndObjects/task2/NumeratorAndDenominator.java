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
        System.out.println(resMultiplication);
    }

    public void division(double number) {
        double resDivision = (double) getX() / getY() / number;
        System.out.println(resDivision);
    }
}
