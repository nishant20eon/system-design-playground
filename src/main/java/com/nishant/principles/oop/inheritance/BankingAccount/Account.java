package com.nishant.principles.oop.inheritance.BankingAccount;

public interface Account {

    void deposit(int amount);
    void withdraw(int amount);
    void calculateInterest(int amount, int rate, int time);
}
