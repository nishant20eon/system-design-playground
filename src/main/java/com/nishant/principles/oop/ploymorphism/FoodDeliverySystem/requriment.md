# Food Delivery System

## Objective

Design a Food Delivery System by applying the concept of **Runtime Polymorphism**.

The goal is to perform the same operation on different types of food orders while allowing each order type to provide its own implementation.

---

## Business Requirements

A restaurant accepts different types of food orders.

Currently, the restaurant supports:

- Veg Order
- Non-Veg Order
- Combo Order

Although all orders are processed in the same system, each order follows different pricing and preparation rules.

---

## Functional Requirements

### 1. Create Order

The system should allow creating different types of food orders.

Each order should contain:

- Order ID
- Customer Name
- Base Price

---

### 2. Calculate Final Bill

Every order should calculate its final bill differently.

#### Veg Order

- Apply 5% discount.
- No packaging charge.

#### Non-Veg Order

- No discount.
- Add a fixed packaging charge.

#### Combo Order

- Apply 10% discount.
- Add packaging charge.
- Add delivery charge.

The application should calculate the bill without checking the order type using `if-else` or `switch`.

---

### 3. Prepare Order

Each order has a different preparation process.

#### Veg Order

- Prepare vegetarian food.
- Pack in green container.

#### Non-Veg Order

- Prepare non-vegetarian food.
- Pack in red container.

#### Combo Order

- Prepare both veg and non-veg items.
- Pack separately.

---

### 4. Print Order Details

The system should display:

- Order ID
- Customer Name
- Order Type
- Final Bill

---

## Business Rules

- Base price must be greater than zero.
- Order ID cannot change after creation.
- Customer name cannot be empty.

---

## Design Guidelines

Create an abstract class named `Order`.

It should contain common properties shared by all order types.

Every order must implement:

- Calculate Final Bill
- Prepare Order

Each order type should provide its own implementation.

Avoid writing code like:

```java
if(orderType.equals("Veg")) {
    ...
}
else if(orderType.equals("NonVeg")) {
    ...
}
```

Instead, let each object decide how to perform its own behavior.

---

## Expected Design

Classes:

Order (Abstract)

- VegOrder
- NonVegOrder
- ComboOrder
- Main

---

## Questions to Think Before Coding

Before writing code, answer the following:

1. What properties are common to every order?
2. Which methods should be declared abstract?
3. Which methods will each child class override?
4. How can one reference variable call different implementations?
5. Why should we avoid using if-else for order types?

---

## Learning Outcome

After completing this exercise, you should understand:

- Runtime Polymorphism
- Method Overriding
- Dynamic Method Dispatch
- Upcasting
- Extensible Design
- Open for Extension, Closed for Modification