package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

public class WarehouseApp {
    public static void main(String[] args) {
        Order order1 = new Order("PL/123");
        Order order2 = new Order("PL/1234");
        Order order3 = new Order("PL/12345");
        Order order4 = new Order("PL/123456");
        Warehouse.addOrder(order1);
        Warehouse.addOrder(order2);
        Warehouse.addOrder(order3);
        Warehouse.addOrder(order4);
        String isOrder = "PL/12341";
        Order isOrderO = null;

        try {
            isOrderO = Warehouse.getOrder(isOrder);
            System.out.println("Order exist, number: "+ isOrder);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order does not exist");
        } finally {
            System.out.println("Thank you for using our Warehouse");
        }
    }
}
