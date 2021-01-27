package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porche;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car increase in 5 sec: " + car.getIncrease());
        System.out.println("Car decrease in 5 sec: " + car.getDecrease());
    }

    private static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Volvo)
            return "Volvo";
        else if (car instanceof Porche)
            return "Porche";
        else
            return "Unknown car name";
    }
}
