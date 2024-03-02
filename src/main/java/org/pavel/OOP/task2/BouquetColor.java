package org.pavel.OOP.task2;

import java.util.Arrays;
import java.util.List;

public class BouquetColor {

    private List<Flower> flowers;

    public BouquetColor(List<Flower> flowers) {
        this.flowers = flowers;
    }
    public void getBouquetColor() {


        for (Flower flower : flowers) {
            System.out.println(flower.getColor());
        }

    }
}
