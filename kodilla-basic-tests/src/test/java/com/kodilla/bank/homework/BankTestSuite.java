package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldZeroValueTransactionToEmptyBank() {

        Bank cashMachinesWarsaw = new Bank();

        int totalBalance = cashMachinesWarsaw.getTotalBalance();
        assertEquals(0, totalBalance);
    }

    @Test
    public void shouldAddOneElementToBank() {

        Bank cashMachinesWarsaw = new Bank();
        CashMachine cashMachineW1 = new CashMachine();
        cashMachineW1.add(1000);
        cashMachineW1.add(-500);
        cashMachineW1.add(2000);
        cashMachineW1.add(-5000);
        cashMachinesWarsaw.addCashMachine(cashMachineW1);

        int totalBalance = cashMachinesWarsaw.getTotalBalance();
        assertEquals(2500, totalBalance);
    }
    @Test
    public void shouldAdd3AndCalculateBalance() {

        Bank cashMachinesWarsaw = new Bank();

        CashMachine cashMachineW1 = new CashMachine();
        cashMachineW1.add(1000);
        cashMachineW1.add(-500);
        cashMachineW1.add(2000);
        cashMachineW1.add(-5000);
        cashMachinesWarsaw.addCashMachine(cashMachineW1);

        CashMachine cashMachineW2 = new CashMachine();
        cashMachineW2.add(200);
        cashMachineW2.add(-100);
        cashMachineW2.add(-99);
        cashMachineW2.add(0);
        cashMachineW2.add(500);
        cashMachinesWarsaw.addCashMachine(cashMachineW2);

        CashMachine cashMachineW3 = new CashMachine();
        cashMachineW3.add(200);
        cashMachineW3.add(-100);
        cashMachineW3.add(-99);
        cashMachinesWarsaw.addCashMachine(cashMachineW3);

        int totalBalance = cashMachinesWarsaw.getTotalBalance();
        assertEquals(3002, totalBalance);
    }

    @Test
    public void shouldZeroValueTransactionInToEmptyBank() {

        Bank cashMachinesWarsaw = new Bank();

        int totalBalance = cashMachinesWarsaw.getTotalTransactionIn();
        assertEquals(0, totalBalance);
    }

    @Test
    public void shouldCalculateNumberOfIncomeTransaction() {

        Bank cashMachinesWarsaw = new Bank();

        CashMachine cashMachineW1 = new CashMachine();
        cashMachineW1.add(1000);
        cashMachineW1.add(-500);
        cashMachineW1.add(2000);
        cashMachineW1.add(-5000);
        cashMachinesWarsaw.addCashMachine(cashMachineW1);

        CashMachine cashMachineW2 = new CashMachine();
        cashMachineW2.add(200);
        cashMachineW2.add(-100);
        cashMachineW2.add(-99);
        cashMachineW2.add(0);
        cashMachineW2.add(500);
        cashMachinesWarsaw.addCashMachine(cashMachineW2);

        CashMachine cashMachineW3 = new CashMachine();
        cashMachineW3.add(200);
        cashMachineW3.add(-100);
        cashMachineW3.add(-99);
        cashMachinesWarsaw.addCashMachine(cashMachineW3);

        int totalBalance = cashMachinesWarsaw.getTotalTransactionIn();
        assertEquals(5, totalBalance);
    }
    @Test
    public void shouldZeroValueTransactionOutToEmptyBank() {

        Bank cashMachinesWarsaw = new Bank();

        int totalNumber = cashMachinesWarsaw.getTotalTransactionOut();
        assertEquals(0, totalNumber);
    }

    @Test
    public void shouldCalculateNumberOutIncomeTransaction() {

        Bank cashMachinesWarsaw = new Bank();

        CashMachine cashMachineW1 = new CashMachine();
        cashMachineW1.add(1000);
        cashMachineW1.add(-500);
        cashMachineW1.add(2000);
        cashMachineW1.add(-5000);
        cashMachinesWarsaw.addCashMachine(cashMachineW1);

        CashMachine cashMachineW2 = new CashMachine();
        cashMachineW2.add(200);
        cashMachineW2.add(-100);
        cashMachineW2.add(-99);
        cashMachineW2.add(0);
        cashMachineW2.add(500);
        cashMachinesWarsaw.addCashMachine(cashMachineW2);

        CashMachine cashMachineW3 = new CashMachine();
        cashMachineW3.add(200);
        cashMachineW3.add(-100);
        cashMachineW3.add(-99);
        cashMachinesWarsaw.addCashMachine(cashMachineW3);

        int totalNumber = cashMachinesWarsaw.getTotalTransactionOut();
        assertEquals(5, totalNumber);
    }
    @Test
    public void shouldZeroValueTotalAverageTransactionInToEmptyBank() {

        Bank cashMachinesWarsaw = new Bank();

        double averageIn = cashMachinesWarsaw.getTotalAverageTransactionIn();
        assertEquals(0, averageIn, 0.01);
    }

    @Test
    public void shouldCalculateTotalAverageTransactionIn() {

        Bank cashMachinesWarsaw = new Bank();

        CashMachine cashMachineW1 = new CashMachine();
        cashMachineW1.add(1000);
        cashMachineW1.add(-500);
        cashMachineW1.add(2000);
        cashMachineW1.add(-5000);
        cashMachinesWarsaw.addCashMachine(cashMachineW1);

        CashMachine cashMachineW2 = new CashMachine();
        cashMachineW2.add(200);
        cashMachineW2.add(-100);
        cashMachineW2.add(-99);
        cashMachineW2.add(0);
        cashMachineW2.add(500);
        cashMachinesWarsaw.addCashMachine(cashMachineW2);

        CashMachine cashMachineW3 = new CashMachine();
        cashMachineW3.add(200);
        cashMachineW3.add(-100);
        cashMachineW3.add(-99);
        cashMachinesWarsaw.addCashMachine(cashMachineW3);

        double averageIn = cashMachinesWarsaw.getTotalAverageTransactionIn();
        assertEquals(780, averageIn, 0.01);
    }
    @Test
    public void shouldZeroValueTotalAverageTransactionOutToEmptyBank() {

        Bank cashMachinesWarsaw = new Bank();

        double average = cashMachinesWarsaw.getTotalAverageTransactionOut();
        assertEquals(0, average, 0.01);
    }

    @Test
    public void shouldCalculateTotalAverageTransactionOut() {

        Bank cashMachinesWarsaw = new Bank();

        CashMachine cashMachineW1 = new CashMachine();
        cashMachineW1.add(1000);
        cashMachineW1.add(-500);
        cashMachineW1.add(2000);
        cashMachineW1.add(-5000);
        cashMachinesWarsaw.addCashMachine(cashMachineW1);

        CashMachine cashMachineW2 = new CashMachine();
        cashMachineW2.add(200);
        cashMachineW2.add(-100);
        cashMachineW2.add(-99);
        cashMachineW2.add(0);
        cashMachineW2.add(500);
        cashMachinesWarsaw.addCashMachine(cashMachineW2);

        CashMachine cashMachineW3 = new CashMachine();
        cashMachineW3.add(200);
        cashMachineW3.add(-100);
        cashMachineW3.add(-99);
        cashMachinesWarsaw.addCashMachine(cashMachineW3);

        double average = cashMachinesWarsaw.getTotalAverageTransactionOut();
        assertEquals(-179.6, average, 0.6);
    }
}

