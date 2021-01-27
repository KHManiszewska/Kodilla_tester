package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel();
        Volvo volvo = new Volvo();
        Porche porche = new Porche();

        doRace(opel);
        doRace(volvo);
        doRace(porche);

    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
