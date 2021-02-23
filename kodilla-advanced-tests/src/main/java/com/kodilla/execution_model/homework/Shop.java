package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Shop {
    Set<Order> shopOrders = new HashSet<>();
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();

    public void addOrder(Order order) {
        if (order.value > 0 && (order.date.isBefore(endDate) || order.date.isEqual(endDate))) {
            this.shopOrders.add(order);
            if (this.startDate.isAfter(order.date)) this.startDate = order.date;
        }
    }

    public Set<Order> getOrdersWithinDates(LocalDate start, LocalDate end) {
        Set<Order> shopOrdersWithinDates = new HashSet<>();
        if (shopOrders.size() > 0 && (start.isBefore(end) || start.isEqual(end))) {
            for (Order order : this.shopOrders) {
                if ((order.date.isEqual(end) || order.date.isBefore(end)) && (order.date.isEqual(start) || order.date.isAfter(start))) {
                    shopOrdersWithinDates.add(order);
                }
            }
            // System.out.println(shopOrdersWithinDates.size() );
            if (shopOrdersWithinDates.size() > 0) return shopOrdersWithinDates;
        }
        return null;
    }

    public Set<Order> getOrdersWithinValueRange(double minimum, double maximum) {
        Set<Order> shopOrdersWithinValueRange = new HashSet<>();
        if (shopOrders.size() > 0 && (minimum <= maximum)) {
            for (Order order : this.shopOrders) {
                if (order.value <= maximum && order.value >= minimum) {
                    shopOrdersWithinValueRange.add(order);
                }
            }
            if (shopOrdersWithinValueRange.size() > 0) return shopOrdersWithinValueRange;
        }
        return null;
    }

    public double getOrdersTotalValue () {
        double valueSumUp = 0;
        if (shopOrders.size() > 0) {
            for (Order order : this.shopOrders)
                valueSumUp = valueSumUp + order.value;
        }
        return valueSumUp;
    }

    public int getOrdersNumber () {
        return this.shopOrders.size();
    }

    public void clear() {
        this.shopOrders.clear();
    }

    public double getOrdersSumUplValue (Set<Order> orders) {
        double valueSumUp = 0;
        if (orders.size() > 0) {
            for (Order order : orders)
                valueSumUp = valueSumUp + order.value;
        }
        return valueSumUp;
    }

    public void removeOrder(Order order) {
        //Order orderToRemove;
        boolean orderIsInSet = false;
        if (shopOrders.size() > 0) {
            for (Order o : this.shopOrders) {
                if (o.equals(order)) {
                    orderIsInSet = true;
                }
            }
            if (orderIsInSet)
                this.shopOrders.remove(order);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return shopOrders.equals(shop.shopOrders) && startDate.equals(shop.startDate) && endDate.equals(shop.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopOrders, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopOrders=" + shopOrders +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
