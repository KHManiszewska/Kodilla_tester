package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class Display {
    public void display(double a, double b, double value, String operation) {
        System.out.println("Result of: " + a + " " + operation + " " + b + " = " + value);
    }
}
