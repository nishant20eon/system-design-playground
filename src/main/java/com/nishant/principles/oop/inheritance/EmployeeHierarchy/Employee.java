package com.nishant.principles.oop.inheritance.EmployeeHierarchy;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void login() {
        System.out.println(name +" logged in.");
    }

    public void logout() {
        System.out.println(name +" logged out.");
    }

    public void work() {
        System.out.println(name +" working.");
    }
}
