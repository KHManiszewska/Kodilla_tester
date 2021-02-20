package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException() {
        super();
        System.out.println("błąd danych");
    }
}
