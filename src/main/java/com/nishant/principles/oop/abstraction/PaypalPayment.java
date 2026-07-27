package com.nishant.principles.oop.abstraction;

public class PaypalPayment extends Payment {


    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Paypal.");
    }
}
