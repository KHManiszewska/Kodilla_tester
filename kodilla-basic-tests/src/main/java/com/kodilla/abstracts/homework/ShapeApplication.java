package com.kodilla.abstracts.homework;

public class ShapeApplication {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle area " + circle.shapeArea());
        System.out.println("Circle perimeter " + circle.shapePerimeter());

        Square square = new Square(5);
        System.out.println("Square area " + square.shapeArea());
        System.out.println("Square perimeter " + square.shapePerimeter());

        Rectangle rectangle = new Rectangle(4 ,5);
        System.out.println("Rectangle area " + rectangle.shapeArea());
        System.out.println("Rectangle perimeter " + rectangle.shapePerimeter());
    }
}
