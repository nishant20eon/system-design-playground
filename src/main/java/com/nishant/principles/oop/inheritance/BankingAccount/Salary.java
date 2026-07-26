package com.nishant.principles.oop.inheritance.BankingAccount;

public class Salary implements Account {
    @Override
    public void deposit(int amount) {
        System.out.println("Salary deposited " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Salary withdrawn " + amount);
    }

    @Override
    public void calculateInterest(int amount, int rate, int time) {
        System.out.println("Salary account interest:  " + amount * rate);
    }
}
