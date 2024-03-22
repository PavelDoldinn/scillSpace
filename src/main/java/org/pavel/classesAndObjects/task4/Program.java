package org.pavel.classesAndObjects.task4;

/**
 * Создать класс описывающий Банкомат.
 * Набор купюр, находящихся в банкомате, должен задаваться свойствами: количеством купюр номиналом 20, 50, 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги.
 * С клавиатуры передается сумма денег. На экран выводим операция удалась или нет.
 * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр разного наминала.
 */
public class Program {
    public static void main(String[] args) {

        ATM atm = new ATM(1, 1, 10);
        System.out.println(atm);
        System.out.println(atm.getSumBanknote());
        System.out.println(atm.getWithdrawCash());
        //System.out.println(atm.setDepositCash());


    }
}
