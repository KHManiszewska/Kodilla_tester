package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car{
    boolean lightsOn = false;
    String carType = "SUV";

    public void headlightsTurnedOn() {
        System.out.println(carType + " headlights TurnedOn");
        this.lightsOn = true;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        System.out.println("night time: " + lightsOn);
        return lightsOn;
    }

    @Override
    public String getCarType() {
        System.out.println("car type - " + carType);
        return carType;
    }
}
