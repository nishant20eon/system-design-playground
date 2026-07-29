package com.nishant.principles.oop.ploymorphism.FoodDeliverySystem;

public abstract class Order {

    protected final int orderId;
    protected String customerName;
    protected double basePrice;

    public Order(int orderId, String customerName, double basePrice) {
        // validation
        if (customerName == null || basePrice < 0) {
            throw new IllegalArgumentException();
        }
        this.orderId = orderId;
        this.customerName = customerName;
        this.basePrice = basePrice;
    }

    public abstract double calcuateBill();
    public abstract void prepareOrder();

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bill: " + calcuateBill());
    }
}
