package org.pavel.OOP.task2;

public abstract class Flower {
    /**
     * Цена
     */
    private int price;
    /**
     * Дата поступления
     */
    private String receiptDate;
    /**
     * Срок годности с даты поступления
     */
    private int bestBeforeDate;
    /**
     * Цвет
     */
    private String color;
    /**
     * Название цветка
     */
    private String name;

    public Flower(String name,  String color, int price, String receiptDate, int bestBeforeDate) {
        this.price = price;
        this.receiptDate = receiptDate;
        this.bestBeforeDate = bestBeforeDate;
        this.color = color;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public int getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(int bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("%s, цена %d, %s, поступил %s, срок годности %s дней",
                name, price, color, receiptDate, bestBeforeDate);
    }
}
