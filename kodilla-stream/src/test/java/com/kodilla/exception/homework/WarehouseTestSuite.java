package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    Order order1 = new Order("PL/123");
    Order order2 = new Order("PL/1234");
    Order order3 = new Order("PL/12345");
    Order order4 = new Order("PL/123456");

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(order1);
        Warehouse.addOrder(order2);
        Warehouse.addOrder(order3);
        Warehouse.addOrder(order4);
        String isOrder = "PL/1234";
        Order orderExp = new Order(isOrder);
        // when
        Order orderActual = Warehouse.getOrder(isOrder);
        // then
        assertEquals(orderExp, orderActual);
    }
    @Test
            //(expected = OrderDoesntExistException.class)
    protected void testGetOrder_withException() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(order1);
        Warehouse.addOrder(order2);
        Warehouse.addOrder(order3);
        Warehouse.addOrder(order4);
        String isNotOrder = "PL/12346";
        Order orderExp = new Order(isNotOrder);
        // when
        Order orderActual = Warehouse.getOrder(isNotOrder);
        // then
        assertEquals(orderExp, orderActual);
    }

}