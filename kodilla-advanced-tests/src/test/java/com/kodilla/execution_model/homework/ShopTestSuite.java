package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Invoice;
import com.kodilla.execution_model.Item;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shopOrders = new Shop();
    Order order1 = new Order(32.5, LocalDate.of(2019,11,20), "KHM");
    Order order2 = new Order(130.57, LocalDate.of(2019,12,23), "Otto");
    Order order3 = new Order(-43.60, LocalDate.of(2020,01,05), "DziedzicMonia27");
    Order order4 = new Order(82.5, LocalDate.of(2021,07,20), "PyzaIza");
    Order order5 = new Order(123, LocalDate.of(2020,02,28), "KHM");
    Order order6 = new Order(182.5, LocalDate.of(2020,05,21), "PyzaIza");
    Order order7 = new Order(123, LocalDate.of(2020,07,12), "KHM");


    @BeforeEach
    public void initializeInvoice() {

        shopOrders.addOrder(order4);
        shopOrders.addOrder(order5);
        shopOrders.addOrder(order6);
        shopOrders.addOrder(order7);
        shopOrders.addOrder(order1);
        shopOrders.addOrder(order2);
        shopOrders.addOrder(order3);
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
    void isShopOrdersCountOK() {

        assertEquals(5, shopOrders.getOrdersNumber());
    }

    @Test
    void areAddedCorrectOrders() {

        Shop shopOrdersTemp = new Shop();
        // shopOrdersTemp.addOrder(order4) - wrong data;
        shopOrdersTemp.addOrder(order5);
        shopOrdersTemp.addOrder(order6);
        shopOrdersTemp.addOrder(order7);
        shopOrdersTemp.addOrder(order1);
        shopOrdersTemp.addOrder(order2);
        // shopOrdersTemp.addOrder(order3) - wrong value;

        assertTrue(shopOrdersTemp.equals(shopOrders));

    }
    @Test
    void isSizeZeroWhenShopEmpty() {
        shopOrders.clear();
        assertEquals(0, shopOrders.getOrdersNumber());
    }

    // Tests for getOrdersWithinDates
    @Test
    void getOrdersWithinDatesWhenShopSetEmpty() {
        shopOrders.clear();
        assertEquals(null, shopOrders.getOrdersWithinDates(LocalDate.of(2020,12,07), LocalDate.now()));
    }

    @Test
    void getOrdersWithinDatesWhenWrongDates() {

        assertEquals(null, shopOrders.getOrdersWithinDates(LocalDate.now(), LocalDate.of(2020,12,07)));
    }

    @Test
    void getOrdersWithinDatesWithEmptyTarget() {

        assertEquals(null, shopOrders.getOrdersWithinDates(LocalDate.of(2019,12,24), LocalDate.of(2020,01,04)));
    }

    @Test
    void getOrdersWithinDatesWhenValidOrdersSetIsNotEmpty() {

        Set<Order> shopOrdersExp = new HashSet<>();
        shopOrdersExp.add(order5);
        shopOrdersExp.add(order1);
        shopOrdersExp.add(order2);

        Set<Order> shopOrdersSelection = new HashSet<>();

        shopOrdersSelection = shopOrders.getOrdersWithinDates(LocalDate.of(2019,11,20), LocalDate.of(2020,02,28));
        assertEquals(shopOrdersExp.size(), shopOrdersSelection.size());
        assertTrue(shopOrdersExp.equals(shopOrdersSelection));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/givenValidDatesRangeWhenOrdersSetNotEmpty.csv", numLinesToSkip = 1)
    void getOrdersWithinDatesWhenValidOrdersSetIsNotEmptyParameters(String startDate, String endDate, int validOrdersNumber, double validOrdersSum) {

        Set<Order> shopOrdersSelection = new HashSet<>();
        Shop shopSelection = new Shop();
        System.out.println(startDate+" - "+endDate+": "+validOrdersNumber+", "+validOrdersSum);
        shopOrdersSelection = shopOrders.getOrdersWithinDates(LocalDate.parse(startDate), LocalDate.parse(endDate));
        assertEquals(validOrdersNumber, shopOrdersSelection.size());
        assertEquals(validOrdersSum, shopSelection.getOrdersSumUplValue(shopOrdersSelection));
    }

    // Tests for getOrdersWithinValueRange
        @Test
    void getOrdersWithinValueRangeWhenShopSetEmpty() {
        shopOrders.clear();
        assertEquals(null, shopOrders.getOrdersWithinValueRange(100, 300));
    }

    @Test
    void getOrdersWithinValueRangeWhenWrongData() {

        assertEquals(null, shopOrders.getOrdersWithinValueRange(300, 100));
    }

    @Test
    void getOrdersWithValueInRangeWhenEmptyTarget() {

        assertEquals(null, shopOrders.getOrdersWithinValueRange(0, 20));
    }

    @Test
    void getOrdersWithValueInRangeValidOrdersSetIsNotEmpty() {
        Set<Order> shopOrdersExp = new HashSet<>();
        shopOrdersExp.add(order2);
        shopOrdersExp.add(order6);

        Set<Order> shopOrdersSelection = new HashSet<>();

        shopOrdersSelection = shopOrders.getOrdersWithinValueRange(125, 190);
        assertEquals(shopOrdersExp.size(), shopOrdersSelection.size());
        assertTrue(shopOrdersExp.equals(shopOrdersSelection));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/givenValuesRangeForOrders.csv", numLinesToSkip = 1)
    void getOrdersWithValueInRangeValidOrdersSetIsNotEmptyParameters(Double minimum, Double maximum, int validOrdersNumber, double validOrdersSum) {

        Set<Order> shopOrdersSelection = new HashSet<>();
        Shop shopSelection = new Shop();
        System.out.println(minimum+" - "+maximum+": "+validOrdersNumber+", "+validOrdersSum);
        shopOrdersSelection = shopOrders.getOrdersWithinValueRange(minimum, maximum);
        assertEquals(validOrdersNumber, shopOrdersSelection.size());
        assertEquals(validOrdersSum, shopSelection.getOrdersSumUplValue(shopOrdersSelection));
    }

    // Tests for getOrdersWithinValueRange
    @Test
    void getOrdersTotalValueWhenShopSetEmpty() {
        shopOrders.clear();
        assertEquals(0, shopOrders.getOrdersTotalValue());
    }

    @Test
    void getOrdersTotalValueWhenShopNotEmpty() {
        System.out.println(shopOrders.getOrdersTotalValue());
        assertEquals(591.57, shopOrders.getOrdersTotalValue(), 0.05);

        shopOrders.removeOrder(order5);
        System.out.println(shopOrders.getOrdersTotalValue());
        assertEquals(468.57, shopOrders.getOrdersTotalValue(), 0.05);

        shopOrders.removeOrder(order4);
        System.out.println(shopOrders.getOrdersTotalValue());
        assertEquals(468.57, shopOrders.getOrdersTotalValue(), 0.05);

        shopOrders.removeOrder(order7);
        System.out.println(shopOrders.getOrdersTotalValue());
        assertEquals(345.57, shopOrders.getOrdersTotalValue(), 0.05);
    }
}