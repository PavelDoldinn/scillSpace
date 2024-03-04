package org.pavel.OOP.task3;
public abstract class Vehicle {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Vehicle(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Транспортное средство %s", name);
    }
}
