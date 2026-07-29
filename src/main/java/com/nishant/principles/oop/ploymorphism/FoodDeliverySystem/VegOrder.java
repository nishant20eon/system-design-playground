package com.nishant.principles.oop.ploymorphism.FoodDeliverySystem;

public class VegOrder extends Order{

    public VegOrder(int orderId, String customerName, double basePrice) {
        super(orderId, customerName, basePrice);
    }

    @Override
    public double calcuateBill() {
        return basePrice - (basePrice * 0.05); // Apply 5% discount for veg orders
    }

    @Override
    public void prepareOrder() {
        System.out.println("Prepare Veg Food and Pack in Green Container");
    }
}
