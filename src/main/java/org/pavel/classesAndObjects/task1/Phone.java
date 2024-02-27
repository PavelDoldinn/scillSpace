package org.pavel.classesAndObjects.task1;

import java.util.Arrays;

public class Phone {
    /**
     * Номер
     */
    private String number;
    /**
     * Модель
     */
    private String model;
    /**
     * Вес
     */
    private int weight;
    private String name = "Pavel";
    public Phone() {

    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Номер %s, Модель %s, Вес %d",number, model, weight);
    }
    String receiveCall(String  name, String number){
        return String.format("Имя %s, Номер %s", name,number);
    }
    String receiveCall() {
        return String.format("Звонит %s", name);
    }
    String getNumber () {
        return String.format(" Номер телефона %s", number);
    }

    String sendMessage(String numberPhone1) {
        String[] numbers = new String[]{numberPhone1};
        return Arrays.toString(numbers);
    }

}
