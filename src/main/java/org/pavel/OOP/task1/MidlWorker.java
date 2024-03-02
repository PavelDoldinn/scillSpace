package org.pavel.OOP.task1;

public class MidlWorker extends JuniorWorker{
    protected final int bonus;

    public MidlWorker(int time, int bid, int plan) {
        super(time, bid, plan);
        bonus = 1000;
    }


    @Override
    public void getSalary() {

        if (plan == 0 || plan < 50) {
            System.out.println("Зарплата = " + (time * bid * 1.1 + bonus) + " рублей.");
        } else if (plan > 50 && plan < 80) {
            System.out.println("Зарплата = " + (time * bid * 1.15 + bonus) + " рублей.");
        } else {
            System.out.println("Зарплата = " + (time * bid * 1.2 + bonus) + " рублей.");
        }
    }
}
