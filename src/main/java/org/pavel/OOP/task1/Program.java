package org.pavel.OOP.task1;

/**
 * Должностная структура на заводе
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
 * Реализовать метод по начислению зарплаты.
 * Иерархия должна иметь хотя бы три уровня.
 * К примеру можно сделать класс Worker с методом getSalary, который возвращает фиксированную зарплату
 * От класса Worker наследуется класс рабочих, у которых кроме фиксированной зарплаты есть еще премия,
 * метод getSalary будем переопределять и в нем использовать родительский super.getSalary для получения
 * фиксированной зарплаты и к ней добавлять премию.
 * Это для примера, в этой задаче у вас есть свобода творчества)
 */
public class Program {
    public static void main(String[] args) {
        Intern intern1 = new Intern(20, 200);
        intern1.getSalary();

        JuniorWorker juniorWorker = new JuniorWorker(20, 200, 10);
        juniorWorker.getSalary();

        MidlWorker midlWorker = new MidlWorker(20, 200, 10);
        midlWorker.getSalary();

        SeniorWorker seniorWorker = new SeniorWorker(20, 200, 0, 1);
        seniorWorker.getSalary();
    }
}
