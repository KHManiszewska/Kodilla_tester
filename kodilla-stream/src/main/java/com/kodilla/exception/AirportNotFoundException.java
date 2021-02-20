package com.kodilla.exception;

public class AirportNotFoundException extends Exception {
    public AirportNotFoundException() {
        super();
        System.out.println("błąd danych");
    }
}
