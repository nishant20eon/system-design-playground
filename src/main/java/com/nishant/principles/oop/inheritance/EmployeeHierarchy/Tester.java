package com.nishant.principles.oop.inheritance.EmployeeHierarchy;

public class Tester extends Employee {

    public Tester(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the application.");
    }

    public void writeTestCases() {
        System.out.println(getName() + " is writing test cases.");
    }
}
