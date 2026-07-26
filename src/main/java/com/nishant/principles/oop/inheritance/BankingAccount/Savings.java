package com.nishant.principles.oop.inheritance.BankingAccount;

public class Savings implements Account{
    @Override
    public void deposit(int amount) {
        System.out.println("Savings deposited " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Savings withdrawn " + amount);
    }

    @Override
    public void calculateInterest(int amount, int rate, int time) {
        // return (amount * rate * time) / 100;
        System.out.println("Savings account interest:  " + amount * rate);
    }
}
