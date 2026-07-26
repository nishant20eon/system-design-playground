package com.nishant.principles.oop.inheritance.EmployeeHierarchy;

public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer(1, "Alice Johnson", 60000, "Java");

        Tester tester = new Tester(2, "Jane Smith", 80000);

        Manager manager = new Manager(3, "Jane Smith", 80000);

        System.out.println("==============Developer==============");
        developer.login();
        developer.work();
        developer.writeCode();
        developer.logout();
        System.out.println();

        System.out.println("===============Tester============");

        tester.login();
        tester.work();
        tester.writeTestCases();
        tester.logout();
        System.out.println();

        System.out.println("===============Manager============");

        manager.login();
        manager.work();
        manager.conductMeeting();
        manager.logout();
    }
}
