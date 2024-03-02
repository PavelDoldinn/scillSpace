package org.pavel.OOP.task1;

public class SeniorWorker extends MidlWorker{

    private int experience;
    public SeniorWorker(int time, int bid, int plan, int experience) {
        super(time, bid, plan);
        this.experience = experience;
    }


    @Override
    public void getSalary() {
        if (experience == 0){
            System.out.println("Зарплата = " + time * bid * 1.1 * 1.1 + " рублей.");
        } else if (experience > 0 && experience < 5) {
            System.out.println("Зарплата = " + time * bid * 1.15 * 1.3 + " рублей.");
        } else if (experience > 5 && experience < 10) {
            System.out.println("Зарплата = " + time * bid * 1.2 * 1.8 + " рублей.");
        } else {
            System.out.println("Зарплата = " + time * bid * 1.2 * 2 + " рублей.");
        }
    }
}
