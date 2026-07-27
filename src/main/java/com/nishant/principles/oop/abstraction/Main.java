package com.nishant.principles.oop.abstraction;

public class Main {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(100.0);

        Payment upiPayment = new UpiPayment();
        upiPayment.pay(200.0);

        Payment paypalPayment = new PaypalPayment();
        paypalPayment.pay(300.0);
    }

}
