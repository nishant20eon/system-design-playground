package com.nishant.principles.oop.encapsulation;


/*
 * Wallet class demonstrates Encapsulation.
 *
 * Encapsulation means:
 * 1. Keep data private
 * 2. Do not allow direct modification
 * 3. Provide controlled methods to change object state
 */
public class Wallet {


    /*
     * walletId is immutable.
     *
     * Once wallet is created,
     * nobody should be able to change it.
     */
    private final int walletId;


    /*
     * Owner name can change,
     * but only through changeOwnerName()
     */
    private String ownerName;


    /*
     * Balance is private.
     *
     * Nobody can directly do:
     *
     * wallet.balance = 100000;
     *
     * Balance can only change through:
     * deposit()
     * withdraw()
     * transferFunds()
     */
    private double balance;


    /*
     * PIN is private.
     *
     * We never expose PIN using getter.
     */
    private int PIN;



    /*
     * Constructor controls object creation.
     *
     * Invalid Wallet objects cannot be created.
     */
    public Wallet(int walletId, String ownerName, int PIN) {


        // Validate owner name
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException(
                    "Owner name cannot be empty"
            );
        }


        // Validate PIN
        if (PIN < 1000 || PIN > 9999) {
            throw new IllegalArgumentException(
                    "PIN must be a 4-digit number"
            );
        }


        this.walletId = walletId;
        this.ownerName = ownerName;

        // Every wallet starts with zero balance
        this.balance = 0.0;

        this.PIN = PIN;
    }



    /*
     * Getter is allowed for walletId
     *
     * because reading ID is safe.
     */
    public int getWalletId() {
        return walletId;
    }



    /*
     * Owner name can be changed,
     * but with validation.
     */
    public void changeOwnerName(String ownerName) {

        if (ownerName == null || ownerName.isBlank()) {
            System.out.println(
                    "Owner name cannot be empty"
            );
            return;
        }

        this.ownerName = ownerName;
    }



    public String getOwnerName() {
        return ownerName;
    }



    /*
     * Reading balance is allowed.
     *
     * But there is no:
     *
     * setBalance()
     *
     * because nobody should directly modify balance.
     */
    public double getBalance() {
        return balance;
    }



    /*
     * Private helper method.
     *
     * External classes cannot access PIN validation.
     */
    private boolean validatePin(int enteredPin) {

        return this.PIN == enteredPin;
    }



    /*
     * Change PIN operation.
     *
     * Old PIN must match.
     * New PIN must be 4 digits.
     */
    public void changePin(int oldPin, int newPin) {


        if (newPin < 1000 || newPin > 9999) {

            System.out.println(
                    "New PIN must be a 4-digit number"
            );

            return;
        }


        if (validatePin(oldPin)) {

            this.PIN = newPin;

            System.out.println(
                    "PIN changed successfully"
            );

        } else {

            System.out.println(
                    "Incorrect old PIN"
            );
        }
    }



    /*
     * Deposit money.
     *
     * Balance changes only here.
     */
    public boolean deposit(double amount) {


        if (amount <= 0) {

            System.out.println(
                    "Deposit amount must be positive"
            );

            return false;
        }


        this.balance += amount;


        System.out.println(
                "Deposited : " + amount +
                        " New Balance : " + balance
        );


        return true;
    }



    /*
     * Withdraw money.
     *
     * Conditions:
     * 1. Amount should be positive
     * 2. Enough balance should exist
     */
    public boolean withdraw(double amount) {


        if (amount <= 0) {

            System.out.println(
                    "Withdrawal amount must be positive"
            );

            return false;
        }


        if (amount > balance) {

            System.out.println(
                    "Insufficient balance"
            );

            return false;
        }


        this.balance -= amount;


        System.out.println(
                "Withdrawn : " + amount +
                        " New Balance : " + balance
        );


        return true;
    }



    /*
     * Transfer money to another wallet.
     *
     * Current wallet = sender
     * 'to' wallet = receiver
     *
     * Example:
     *
     * walletA.transferFunds(walletB,500);
     */
    public boolean transferFunds(Wallet to, double amount) {


        if (amount <= 0) {

            System.out.println(
                    "Transfer amount must be positive"
            );

            return false;
        }


        if (amount > this.balance) {

            System.out.println(
                    "Insufficient balance"
            );

            return false;
        }


        /*
         * Decrease sender balance
         */
        this.balance -= amount;


        /*
         * Increase receiver balance
         *
         * We are using deposit()
         * instead of directly changing:
         *
         * to.balance += amount
         *
         * This maintains encapsulation.
         */
        to.deposit(amount);



        System.out.println(
                "Transferred " + amount +
                        " from wallet " + this.walletId +
                        " to wallet " + to.walletId
        );


        return true;
    }
}