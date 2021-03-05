package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DhlDeliveryServices implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 20) {
            System.out.println("DHL: Package too heavy");
            return false;
        }
        System.out.println("DHL: Delivering in progress...");
        return true;
    }
}
