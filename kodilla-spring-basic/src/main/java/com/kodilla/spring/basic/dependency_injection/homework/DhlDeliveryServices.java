package com.kodilla.spring.basic.dependency_injection.homework;

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
