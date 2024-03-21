package org.pavel.classesAndObjects.task4;

import java.util.Scanner;

public class ATM {

    private final Scanner scanner = new Scanner(System.in);
    private int banknote_20;
    private int banknote_50;
    private int banknote_100;
    private int withdrawCash;
    private int countBanknote_100;
    private int countBanknote_50;
    private int countBanknote_20;
    private boolean isCheckWithdrawCash;
    private String copyWithdrawCash;
    private int sumBanknotes;
    private int depositCash;
    public ATM(int banknote_20, int banknote_50, int banknote_100) {
        this.banknote_20 = banknote_20;
        this.banknote_50 = banknote_50;
        this.banknote_100 = banknote_100;
    }
    public int getBanknote_20() {
        return banknote_20;
    }
    public int getBanknote_50() {
        return banknote_50;
    }
    public int getBanknote_100() {
        return banknote_100;
    }
    public String getSumBanknote() {
        checkSumATM();
        return String.format("Сумма в банкомате %s р.", sumBanknotes);
    }
    public String putCash() {
        return null;
    }
    public String getWithdrawCash() { // снять наличные
        checkWithdrawCashInt();
        checkSumATM();

        if (sumBanknotes >= withdrawCash && withdrawCash > 99) {
            countBanknote_100 = withdrawCash / 100;
            withdrawCash = withdrawCash % 100;
            if (sumBanknotes >= withdrawCash && withdrawCash > 49) {
                countBanknote_50 = withdrawCash / 50;
                withdrawCash = withdrawCash % 50;
            }

            if (sumBanknotes >= withdrawCash && withdrawCash > 19) {
                countBanknote_20 = withdrawCash / 20;
                withdrawCash = withdrawCash % 20;
            }
            if (withdrawCash <= 19 && withdrawCash != 0) {
                return String.format("Такую сумму нельзя снять");
            }
            return String.format("100р. купюр снято %sшт.\n50р. купюр снято %sшт.\n20р. купюр снято %sшт.",
                    countBanknote_100, countBanknote_50, countBanknote_20);
        } else {
            return String.format("Не получиться снять %sp.", withdrawCash);
        }
    }
    public String setDepositCash() {
        System.out.println("Внесите наличные.");
        depositCash = scanner.nextInt();
        int copyDepositCash = depositCash;
        if (depositCash <= 19) {
            return String.format("Внести %sр. Не получилось", depositCash);
        } else {
            countBanknote_100 = copyDepositCash / 100;
            copyDepositCash = copyDepositCash % 100;
            countBanknote_50 = copyDepositCash / 50;
            copyDepositCash = copyDepositCash % 50;
            countBanknote_20 = copyDepositCash / 20;
            copyDepositCash = copyDepositCash % 20;
            if (copyDepositCash <= 19 && copyDepositCash != 0) {
                return String.format("Внести %sр. Не получилось", depositCash);
            }
            return String.format("Наличные внесены %sр.", depositCash);
        }
    }
    private int checkWithdrawCashInt() {
        do {
            System.out.println("Введите сумму для снятия наличных.");
            copyWithdrawCash = scanner.nextLine();
            try {
                withdrawCash = Integer.parseInt(copyWithdrawCash);
                isCheckWithdrawCash = false;
            } catch (RuntimeException e) {
                System.out.println("Введите целое число.");
                isCheckWithdrawCash = true;
            }
        } while (isCheckWithdrawCash);
        return withdrawCash;
    }
    private int checkSumATM() {
        sumBanknotes = (getBanknote_20() * 20) + (getBanknote_50() * 50) + (getBanknote_100() * 100);
        return sumBanknotes;
    }
    @Override
    public String toString() {
        return String.format("В банкомате купюр по 20р.-%s шт., купюр по 50р.-%s шт., купюр по 100р.-%s шт.",
                getBanknote_20(), getBanknote_50(), getBanknote_100());
    }
}
