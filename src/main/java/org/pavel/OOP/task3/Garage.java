package org.pavel.OOP.task3;

public class Garage <T extends Vehicle>{
    public T item;

    public T getItem() {
        return item;
    }
    public Garage(T item) {
        this.item = item;
    }
}
