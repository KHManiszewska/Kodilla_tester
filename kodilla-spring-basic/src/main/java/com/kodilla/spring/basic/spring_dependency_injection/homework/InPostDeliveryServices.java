package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InPostDeliveryServices implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("InPost: Package too heavy");
            return false;
        }
        System.out.println("InPost: Delivering in progress...");
        return true;
    }
}
