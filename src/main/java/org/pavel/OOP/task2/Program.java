package org.pavel.OOP.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
 * ○  Создать несколько объектов-цветов со свойствами:
 *     - стоимость
 *     - дата поступления
 *     - срок годности с даты поступления
 *     - цвет
 *    Все поля сделайте private  и напишите для всех полей getter и setter методы
 * ○  Собрать букет и определить его стоимость. (Напишите метод для сбора букета)
 * ○  Определить все цвета, используемые в букете.
 * *** Определить, когда весь букет завянет (Не обязательное)
 * В букет может входить несколько цветов одного типа.
 */
public class Program {
    public static void main(String[] args) {


        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Cornflower("василёк", "Белый", 200, "02.03.2024", 5));
        flowers.add(new Poppy("мак", "красный", 200, "02.03.2024", 5));
        flowers.add(new Mimosa("мимоза", "Синий", 200, "02.03.2024", 5));
        flowers.add(new Rose("роза", "красный", 200, "02.03.2024", 5));
        SumPrise sumPrise = new SumPrise(flowers);
        sumPrise.getSumPrice();
        BouquetColor bouquetColor = new BouquetColor(flowers);
        bouquetColor.getBouquetColor();


    }
}
