package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class Opel implements Car {

    int speed;
    int increase;
    int decrease;

    public Opel(int increase, int decrease) {
        this.speed = 0;
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public int getIncrease() {
        return increase;
    }

    @Override
    public int getDecrease() {
        return decrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increase;
    }

    @Override
    public void decreaseSpeed() {
        if (speed >= decrease) {
            speed = speed - decrease;
        }
        else {speed = 0;}
    }
}
