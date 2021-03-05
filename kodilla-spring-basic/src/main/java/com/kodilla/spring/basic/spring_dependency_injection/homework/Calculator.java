package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        double sum = a +b;
        display.display(a, b, sum, "add");
        return sum;
    }

    public double subtract(double a, double b){
        double sub = a - b;
        display.display(a, b, sub, "subtract");
        return sub;
    }

    public double multiply(double a, double b){
        double multi = a * b;
        display.display(a, b, multi, "multiply");
        return multi;
    }

    public double divide(double a, double b){
        double div = a / b;
        display.display(a, b, div, "divide");
        return div;
    }

}
