package org.pavel.OOP.task1;

public class Intern {

    /**
     * рабочих часов
     */
    protected int time;
    /**
     * Ставка в час
     */
    protected int bid;

    public Intern(int time, int bid) {
        this.time = time;
        this.bid = bid;
    }

    public void getSalary(){
        System.out.println("Зарплата = " + time * bid + " рублей.");
    }

}
