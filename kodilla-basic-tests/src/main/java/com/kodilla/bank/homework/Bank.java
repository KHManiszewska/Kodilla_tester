package com.kodilla.bank.homework;

import com.kodilla.school.Grades;

public class Bank {
    private CashMachine[] cashMachines;
    private int countCashMachines;

    public Bank() {
        this.countCashMachines = 0;
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine newCashMachine) {
        this.countCashMachines ++;
        CashMachine[] newTab = new CashMachine[this.countCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.countCashMachines - 1] = newCashMachine;
        this.cashMachines = newTab;

    }
    public int getTotalBalance() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {

            sum += this.cashMachines[i].getBalance();
        }
        return sum;
    }
    public int getTotalTransactionIn() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getNumberTransactionIn();
        }
        return sum;
    }

    public int getTotalTransactionOut() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getNumberTransactionOut();
        }
        return sum;
    }
    public double getTotalAverageTransactionIn() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        int transactionNumber = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getBalanceTransactionIn();
            transactionNumber += this.cashMachines[i].getNumberTransactionIn();
        }
        return sum/transactionNumber;
    }

    public double getTotalAverageTransactionOut() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        int transactionNumber = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getBalanceTransactionOut();
            transactionNumber += this.cashMachines[i].getNumberTransactionOut();
        }
        return sum/transactionNumber;
    }
}
