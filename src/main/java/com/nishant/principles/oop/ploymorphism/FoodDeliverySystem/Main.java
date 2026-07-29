package com.nishant.principles.oop.ploymorphism.FoodDeliverySystem;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== VEG ORDER ==========");
        Order order = new VegOrder(101, "Nishant", 500);

        order.printOrderDetails();
        order.prepareOrder();

        System.out.println();


        System.out.println("========== NON-VEG ORDER ==========");
        order = new NonVegOrder(102, "Rahul", 600);

        order.printOrderDetails();
        order.prepareOrder();

        System.out.println();


        System.out.println("========== COMBO ORDER ==========");
        order = new ComboOrder(103, "Amit", 800);

        order.printOrderDetails();
        order.prepareOrder();

        System.out.println();


        System.out.println("========== FESTIVAL ORDER ==========");
        order = new FestivalOrder(104, "Priya", 1000);

        order.printOrderDetails();
        order.prepareOrder();

        System.out.println();
    }
}