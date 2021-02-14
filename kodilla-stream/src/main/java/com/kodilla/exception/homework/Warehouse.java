package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.stream.homework.TaskManager;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Warehouse {
    static Set<Order> orders = new HashSet<>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        Order order = null;
        for (Order o : orders) {
            if (o.getNumber().equals(number))
            return o;
        }
        throw new OrderDoesntExistException();
    }
}
