package com.nishant.principles.oop.inheritance.EmployeeHierarchy;

public class Manager extends Employee {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }

    public void conductMeeting() {
        System.out.println(getName() + " is conducting a meeting.");
    }
}
