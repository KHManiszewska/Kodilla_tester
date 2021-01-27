package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porche;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(20) + 1];

        System.out.println("Wylosowano: " + cars.length + " różnych samochodów");

        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();

        for ( Car car : cars)
            CarUtils.displayCarInfo(car);
    }
    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);  // possible values: 0, 1, 2
        int a = random.nextInt(100) + 5;       // possible values: 1.000-100.999 ...
        int b = random.nextInt(50) + 5;
        if (drawnCarKind == 0)
            return new Opel(a, b);
        else if (drawnCarKind == 1)
            return new Porche(a, b);
        else
            return new Volvo(a, b);
    }
}
