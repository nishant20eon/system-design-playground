package com.nishant.principles.oop.inheritance.BankingAccount;

public class Current implements Account{
    @Override
    public void deposit(int amount) {
        System.out.println("Current deposited " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Current withdrawn " + amount);
    }

    @Override
    public void calculateInterest(int amount, int rate, int time) {
        // return (amount * rate * time) / 100;
        System.out.println("Current account interest:  " + amount * rate);
    }
}
