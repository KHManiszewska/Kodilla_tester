package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(6, 8);
        Volvo volvo = new Volvo(10, 15);
        Porche porche = new Porche(20, 25);

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
