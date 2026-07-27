package com.nishant.principles.oop.encapsulation;

public class Main {

    public static void main(String[] args) {


        /*
         * Creating wallets
         *
         * Initial balance will be 0.0
         */
        Wallet walletA = new Wallet(
                101,
                "Nishant",
                1234
        );


        Wallet walletB = new Wallet(
                102,
                "Rahul",
                5678
        );



        /*
         * Checking wallet details
         */
        System.out.println(
                "Wallet ID : " + walletA.getWalletId()
        );

        System.out.println(
                "Owner Name : " + walletA.getOwnerName()
        );

        System.out.println(
                "Initial Balance : " + walletA.getBalance()
        );



        System.out.println("-------------------------");



        /*
         * Deposit money
         */
        walletA.deposit(1000);



        /*
         * Check balance after deposit
         */
        System.out.println(
                "Wallet A Balance : "
                        + walletA.getBalance()
        );



        System.out.println("-------------------------");



        /*
         * Withdraw money
         */
        walletA.withdraw(300);



        System.out.println(
                "Wallet A Balance after withdrawal : "
                        + walletA.getBalance()
        );



        System.out.println("-------------------------");



        /*
         * Transfer money
         *
         * Wallet A sends money to Wallet B
         */
        walletA.transferFunds(
                walletB,
                400
        );



        System.out.println(
                "Wallet A Balance : "
                        + walletA.getBalance()
        );


        System.out.println(
                "Wallet B Balance : "
                        + walletB.getBalance()
        );



        System.out.println("-------------------------");



        /*
         * Change PIN
         *
         * Correct old PIN
         */
        walletA.changePin(
                1234,
                9999
        );



        /*
         * Incorrect old PIN example
         */
        walletA.changePin(
                1234,
                1111
        );



        System.out.println("-------------------------");



        /*
         * Change owner name
         */
        walletA.changeOwnerName(
                "Nishant Kumar"
        );


        System.out.println(
                "Updated Owner : "
                        + walletA.getOwnerName()
        );



        System.out.println("-------------------------");



        /*
         * Invalid operations testing
         */

        // Invalid deposit
        walletA.deposit(-500);


        // Withdraw more than balance
        walletB.withdraw(1000);


        // Invalid PIN
        walletA.changePin(
                9999,
                2222
        );
    }
}