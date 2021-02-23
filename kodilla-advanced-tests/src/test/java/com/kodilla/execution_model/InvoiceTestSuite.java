package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoiceItems = new Invoice();
    Item item1 = new Item("productA", 2.50);
    Item item2 = new Item("productB", 3.60);
    Item item3 = new Item("productC", 4.50);
    Item item4 = new Item("productD", 1.50);
    Item itemTemp;

    @BeforeEach
    public void initializeInvoice() {
        invoiceItems.addItem(item1);
        invoiceItems.addItem(item2);
        invoiceItems.addItem(item3);
        invoiceItems.addItem(item4);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    void isInvoiceItemCountOK() {

        assertEquals(4, invoiceItems.getSize());
    }

    @Test
    void isAddedItemCorrect() {

        itemTemp = invoiceItems.getItem(3);
        assertEquals(itemTemp, item4);

    }

    @Test
    void isNullWhenOutOfRangeMinus1() {

        itemTemp = invoiceItems.getItem(-1);
        assertEquals(null, itemTemp);
    }
    @Test
    void isNullWhenOutOfRange() {

        itemTemp = invoiceItems.getItem(4);
        assertEquals(null, itemTemp);
    }
    @Test
    void isInvoiceClearOK() {

        invoiceItems.clear();
        assertEquals(0, invoiceItems.getSize());
    }
}