package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DhlDeliveryServices();
        NotificationService notificationService = new DhlNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 20.2);
        DeliveryService deliveryServiceIn = new InPostDeliveryServices();
        NotificationService notificationServiceIn = new InPostNotificationService();
        ShippingCenter shippingCenterIn = new ShippingCenter(deliveryServiceIn, notificationServiceIn);
        shippingCenterIn.sendPackage("Hill Street 11, New York", 20.2);
    }
}
