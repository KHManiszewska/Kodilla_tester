package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Zamek", 2.5, 3.5, true));
        stamps.add(new Stamp("Królowa", 2, 3, false));
        stamps.add(new Stamp("Papież", 2.5, 3, false));
        stamps.add(new Stamp("Lewandowski", 1.5, 3, true));
        stamps.add(new Stamp("Królowa", 2, 3, false));

        System.out.println("Set stamps size: "+stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
