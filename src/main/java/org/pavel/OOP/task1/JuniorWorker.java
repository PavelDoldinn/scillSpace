package org.pavel.OOP.task1;

public class JuniorWorker extends Intern {
    protected int plan;

    public JuniorWorker(int time, int bid, int plan) {
        super(time, bid);
        this.plan = plan;
    }


    @Override
    public void getSalary() {

        if (plan == 0 || plan < 50) {
            System.out.println("Зарплата = " + time * bid * 1.1 + " рублей.");
        } else if (plan > 50 && plan < 80) {
            System.out.println("Зарплата = " + time * bid * 1.15 + " рублей.");
        } else {
            System.out.println("Зарплата = " + time * bid * 1.2 + " рублей.");
        }
    }

}
