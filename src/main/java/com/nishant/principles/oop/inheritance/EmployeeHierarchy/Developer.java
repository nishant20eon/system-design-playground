package com.nishant.principles.oop.inheritance.EmployeeHierarchy;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage=programmingLanguage;
    }

    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }

    public void writeCode() {
        System.out.println(getName() + " is developing feactures using " + programmingLanguage);
    }
}
