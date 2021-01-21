package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    static final double PI = 3.1415927;
    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return PI * radius * radius;
    }

    @Override
    public double shapePerimeter() {
        return PI * 2 * radius;
    }
}
