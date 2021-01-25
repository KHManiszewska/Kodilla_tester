package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int balance;
    private int countIn;
    private int countOut;
    private int balanceIn;
    private int balanceOut;

    public CashMachine() {
        this.size = 0;
        this.balance = 0;
        this.transactions = new int[0];
        this.countIn = 0;
        this.countOut = 0;
        this.balanceIn = 0;
        this.balanceOut = 0;
    }

    public void add(int value) {
        if (value < 0 && - value > balance) {
            System.out.println("This transaction is not possible");
            return;
        }
        if (value < 0 ) {
            countOut ++;
            balanceOut +=value;
        }
        else if (value == 0){
            System.out.println("No transaction");
            return;
        }
        else {
            countIn ++;
            balanceIn +=value;
        }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
        this.balance += value;
    }

    public int[] getTransactions() {
        return this.transactions;
    }
    public int getNumberTransactions() {
        return size;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        return this.balance;
    }

    public int getNumberTransactionIn() {
        return countIn;
    }

    public int getNumberTransactionOut() {
        return countOut;
    }
    public int getBalanceTransactionIn() {
        return balanceIn;
    }

    public int getBalanceTransactionOut() {
        return balanceOut;
    }

    public double getAverageIn() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
            sum += this.transactions[i];
            }
        }
        return sum/countIn;
    }

    public double getAverageOut() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum/countOut;
    }
}
