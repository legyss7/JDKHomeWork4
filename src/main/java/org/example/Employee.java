package org.example;

public class Employee {
    private final String tabNumber;
    private final String phoneNumber;
    private final String name;
    private final int experience;


    public Employee(String tabNumber, String phoneNumber, String name, int age) {
        this.tabNumber = tabNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = age;
    }

    public String getTabNumber() {
        return tabNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return experience;
    }
}
