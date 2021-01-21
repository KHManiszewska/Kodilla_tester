package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    double sideX;
    double sideY;

    public Rectangle(double sideX, double sideY) {
        super();
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public double shapeArea() {
        return sideX*sideY;
    }

    @Override
    public double shapePerimeter() {
        return 2*sideX + 2*sideY;
    }
}
