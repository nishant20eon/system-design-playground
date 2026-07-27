# Wallet Management System

## Objective

Design a Wallet Management System by applying the concept of **Encapsulation**.

The goal is to ensure that the wallet's internal data is protected and can only be modified through valid business operations.

---

## Business Requirements

A wallet belongs to a single user.

Each wallet should contain the following information:

- Wallet ID
- Owner Name
- Balance
- PIN

---

## Functional Requirements

### 1. Create Wallet

The system should allow creating a new wallet with:

- Wallet ID
- Owner Name
- PIN

When a wallet is created:

- Initial balance should be **0.0**
- Wallet ID must be unique
- PIN should be exactly 4 digits

---

### 2. Deposit Money

A user should be able to deposit money into the wallet.

Rules:

- Deposit amount must be greater than zero.
- After a successful deposit, wallet balance should increase.
- Display a success message after deposit.

Example:

Current Balance : 1000

Deposit : 500

New Balance : 1500

---

### 3. Withdraw Money

A user should be able to withdraw money.

Rules:

- Withdrawal amount must be greater than zero.
- User cannot withdraw more than the available balance.
- Display an appropriate message if balance is insufficient.

Example:

Current Balance : 1000

Withdraw : 300

New Balance : 700

---

### 4. Transfer Money

A user should be able to transfer money to another wallet.

Rules:

- Sender must have sufficient balance.
- Transfer amount must be greater than zero.
- Sender balance decreases.
- Receiver balance increases.

Example:

Wallet A Balance : 1000

Wallet B Balance : 500

Transfer : 300

Wallet A Balance : 700

Wallet B Balance : 800

---

### 5. Check Balance

A user should be able to view the current wallet balance.

---

### 6. Change PIN

A user should be able to change the wallet PIN.

Rules:

- User must provide the current PIN.
- New PIN must contain exactly 4 digits.
- Incorrect current PIN should not allow the change.

---

## Validation Rules

- Wallet ID should never change after wallet creation.
- Owner Name cannot be empty.
- Balance should never become negative.
- Deposit amount must be greater than zero.
- Withdrawal amount must be greater than zero.
- Transfer amount must be greater than zero.
- PIN must always contain exactly 4 digits.

---

## Encapsulation Guidelines

The following data should **not** be directly modifiable by other classes:

- Wallet ID
- Balance
- PIN

These values should only change through business methods.

Examples:

- Deposit Money
- Withdraw Money
- Transfer Money
- Change PIN

Avoid exposing setters that allow unrestricted modification of sensitive data.

---

## Expected Design

Identify the required classes.

Example:

Wallet

(Optional)

- Transaction
- WalletService
- Main

---

## Questions to Think Before Coding

Before writing code, answer the following:

1. Which fields should be private?
2. Which fields require only getters?
3. Which fields should never have setters?
4. Which methods will modify the wallet balance?
5. Which methods require validation?
6. Which data should remain immutable after object creation?

---

## Learning Outcome

After completing this exercise, you should understand:

- Encapsulation
- Data Hiding
- Validation
- Business Logic inside Objects
- Object State Management
- Getter vs Setter usage
- Designing objects based on behavior instead of exposing data