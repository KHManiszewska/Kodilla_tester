package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Porche;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Porche> cars = new ArrayList<>();
        Porche porcheBasic = new Porche(80, 40);
        cars.add(porcheBasic);
        cars.add(new Porche(100, 50));
        cars.add(new Porche(130, 80));

        System.out.println(cars.size());            // [2]
        for (Porche car : cars) {
            CarUtils.displayCarInfo(car);
        }

        cars.remove(1);

        System.out.println(cars.size());            // [2]
        for (Porche car : cars) {
            CarUtils.displayCarInfo(car);
        }
        cars.remove(porcheBasic);
        System.out.println(cars.size());            // [2]
        for (Porche car : cars) {
            CarUtils.displayCarInfo(car);
        }

        Porche porcheVIP = new Porche(130, 80);   // [2]
        cars.remove(porcheVIP);                              // [3]

        System.out.println(cars.size());            // [2]
        for (Porche car : cars) {
            CarUtils.displayCarInfo(car);
        }
    }

}
