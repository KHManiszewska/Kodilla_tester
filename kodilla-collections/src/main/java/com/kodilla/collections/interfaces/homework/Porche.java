package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Porche implements Car{
    int speed;
    int increase;
    int decrease;

    public Porche(int increase, int decrease) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porche porche = (Porche) o;
        return speed == porche.speed && increase == porche.increase && decrease == porche.decrease;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increase, decrease);
    }
}
