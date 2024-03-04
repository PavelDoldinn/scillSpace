package org.pavel.OOP.task3;

/**
 * Параметризованный гараж
 * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
 * Создать поле name в классе Vehicle и проинициализировать его через конструктора.
 * Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
 * Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.
 */
public class Program {
    public static void main(String[] args) {
        Garage<Car> car1 = new Garage(new Car("Лада"));
        System.out.println(car1.getItem());

        Garage<Motorcycle> moto1 = new Garage(new Motorcycle("Урал"));
        System.out.println(moto1.getItem());


    }

}
