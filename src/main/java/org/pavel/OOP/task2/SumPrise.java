package org.pavel.OOP.task2;

import java.util.List;

public class SumPrise {

    private List<Flower> flowers;

    public SumPrise(List<Flower> flowers) {
        this.flowers = flowers;
    }
    public void getSumPrice(){

        int sum = 0;
        for (Flower flower : flowers) {
            sum = sum + flower.getPrice();
        }
        System.out.println("Цена букета " + sum + " рублей.");
    }
}
