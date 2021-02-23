package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    double value;
    LocalDate date;
    String userLogin;

    public Order(double value, LocalDate date, String userLogin) {
        this.value = value;
        this.date = date;
        this.userLogin = userLogin;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && date.equals(order.date) && userLogin.equals(order.userLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, userLogin);
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }
}
