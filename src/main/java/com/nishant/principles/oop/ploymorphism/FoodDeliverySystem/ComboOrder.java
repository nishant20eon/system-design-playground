package com.nishant.principles.oop.ploymorphism.FoodDeliverySystem;

public class ComboOrder extends Order {

    private final static int PACKING_CHARGE = 20;
    private final static int DELIVERY_CHARGE = 30;

    public ComboOrder(int orderId, String customerName, double basePrice) {
        super(orderId, customerName, basePrice);
    }

    @Override
    public double calcuateBill() {
        return basePrice * 0.9 + PACKING_CHARGE + DELIVERY_CHARGE; // Apply 10% discount for combo orders
    }

    @Override
    public void prepareOrder() {
        System.out.println("Prepare Combo Order: Veg and Non-Veg items and Pack separately");
    }
}
