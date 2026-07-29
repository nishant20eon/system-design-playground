package com.nishant.principles.oop.ploymorphism.FoodDeliverySystem;

public class NonVegOrder extends Order{

    private int packingCharge = 10;

    public NonVegOrder(int orderId, String customerName, double basePrice) {
        super(orderId, customerName, basePrice);
    }

    @Override
    public double calcuateBill() {
        return basePrice + packingCharge;
    }

    @Override
    public void prepareOrder() {
        System.out.println("Prepare Non-Veg Food and Pack in Red Container");
    }

    @Override
    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bill: " + calcuateBill());
    }
}
