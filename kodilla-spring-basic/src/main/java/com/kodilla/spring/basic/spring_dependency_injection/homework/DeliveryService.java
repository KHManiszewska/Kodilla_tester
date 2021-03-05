package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;


public interface DeliveryService {

    boolean deliverPackage(String address, double weight);
}
