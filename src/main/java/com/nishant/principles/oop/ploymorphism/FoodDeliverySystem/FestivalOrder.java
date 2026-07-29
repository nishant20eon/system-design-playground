package com.nishant.principles.oop.ploymorphism.FoodDeliverySystem;

public class FestivalOrder extends Order {

    private final static int PACKING_CHARGE = 20;
    private final static int DELIVERY_CHARGE = 30;

    public FestivalOrder(int orderId, String customerName, double basePrice) {
        super(orderId, customerName, basePrice);
    }

    @Override
    public double calcuateBill() {
        return basePrice * 0.85 + PACKING_CHARGE + DELIVERY_CHARGE; // Apply 15% discount for festival orders
    }

    @Override
    public void prepareOrder() {
        System.out.println("Prepare Festival Special Items and Pack in Festive Container and Free dessert");
    }
}
