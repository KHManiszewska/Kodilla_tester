package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashTransactions = new CashMachine();
        int[] transactions = cashTransactions.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);

        int[] transactions = cashTransactions.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(200, transactions[0]);
        assertEquals(-100, transactions[1]);
    }

    @Test
    public void shouldOutTransactionToEmptyArray() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(-100);

        int[] transactions = cashTransactions.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldOutTransactionToSmallAmount() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-101);

        int[] transactions = cashTransactions.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(200, transactions[0]);
        assertEquals(-100, transactions[1]);
    }

    @Test
    public void shouldZeroValueTransactionToArray() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(1000);
        cashTransactions.add(-500);
        cashTransactions.add(2000);
        cashTransactions.add(0);

        int[] transactions = cashTransactions.getTransactions();
        assertEquals(3, transactions.length);
    }

    @Test
    public void GoodNumberTransaction() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(1000);
        cashTransactions.add(-500);
        cashTransactions.add(2000);

        int numberTransaction = cashTransactions.getNumberTransactions();
        assertEquals(3, numberTransaction);
    }

    @Test
    public void GoodNumberTransactionWhenZero() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(1000);
        cashTransactions.add(-500);
        cashTransactions.add(2000);
        cashTransactions.add(0);

        int numberTransaction = cashTransactions.getNumberTransactions();
        assertEquals(3, numberTransaction);
    }

    @Test
    public void GoodNumberTransactionWhenError() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-105);

        int numberTransaction = cashTransactions.getNumberTransactions();
        assertEquals(2, numberTransaction);
    }

    @Test
    public void GoodBalance() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);

        int balance = cashTransactions.getBalance();
        assertEquals(1, balance);
    }

    @Test
    public void GoodBalanceToEmptyArray() {
        CashMachine cashTransactions = new CashMachine();
        int balance = cashTransactions.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void GoodNumberTransactionIn() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);

        int numberIn = cashTransactions.getNumberTransactionIn();
        assertEquals(1, numberIn);
    }
    @Test
    public void GoodNumberTransactionInWithZeroAndOver() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);
        cashTransactions.add(0);
        cashTransactions.add(500);
        cashTransactions.add(250);
        cashTransactions.add(-2000);

        int numberIn = cashTransactions.getNumberTransactionIn();
        assertEquals(3, numberIn);
    }
    @Test
    public void GoodNumberTransactionOut() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);

        int numberIn = cashTransactions.getNumberTransactionOut();
        assertEquals(2, numberIn);
    }
    @Test
    public void GoodNumberTransactionOutWithZeroAndOver() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);
        cashTransactions.add(0);
        cashTransactions.add(500);
        cashTransactions.add(250);
        cashTransactions.add(-2000);

        int numberIn = cashTransactions.getNumberTransactionOut();
        assertEquals(2, numberIn);
    }
    @Test
    public void shouldCalculateAverageInZeroLength() {
        CashMachine cashTransactions = new CashMachine();
        double average = cashTransactions.getAverageIn();
        assertEquals(0, average);
    }
    @Test
    public void shouldCalculateAverageIn() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);
        cashTransactions.add(0);
        cashTransactions.add(500);
        cashTransactions.add(250);
        cashTransactions.add(-2000);
        double average = cashTransactions.getAverageIn();
        assertEquals(316.66, average, 0.01);
    }

    @Test
    public void shouldCalculateAverageOutZeroLength() {
        CashMachine cashTransactions = new CashMachine();
        double average = cashTransactions.getAverageOut();
        assertEquals(0, average);
    }
    @Test
    public void shouldCalculateAverageOut() {
        CashMachine cashTransactions = new CashMachine();
        cashTransactions.add(200);
        cashTransactions.add(-100);
        cashTransactions.add(-99);
        cashTransactions.add(0);
        cashTransactions.add(500);
        cashTransactions.add(250);
        cashTransactions.add(-2000);
        double average = cashTransactions.getAverageOut();
        assertEquals(-99.5, average, 0.01);
    }
}
