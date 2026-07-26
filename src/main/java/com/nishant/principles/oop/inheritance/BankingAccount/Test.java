package com.nishant.principles.oop.inheritance.BankingAccount;

public class Test {

    public static void main(String[] args) {
        Account savings = new Savings();
        savings.deposit(1000);
        savings.withdraw(500);
        savings.calculateInterest(1000, 5, 1);

        Account current = new Current();
        current.deposit(2000);
        current.withdraw(1000);
        current.calculateInterest(2000, 3, 1);

        Account salary = new Salary();
        salary.deposit(3000);
        salary.withdraw(1500);
        salary.calculateInterest(3000, 4, 1);
    }
}
