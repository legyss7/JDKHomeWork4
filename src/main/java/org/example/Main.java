package org.example;

import java.util.List;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер,
 * Номер телефона,
 * Имя,
 * Стаж.
 * Добавить метод, который ищет сотрудника по стажу (может быть список).
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список).
 * Добавить метод, который ищет сотрудника по табельному номеру.
 * Добавить метод добавление нового сотрудника в справочник.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(new Employee(
                "123", "996555213254", "Ivan", 30));
        directory.addEmployee(new Employee(
                "124", "996555324499", "John", 30));
        directory.addEmployee(new Employee(
                "125", "996555918171", "Masha", 21));
        directory.addEmployee(new Employee(
                "126", "996555191817", "Masha", 22));


        System.out.println("Поиск сотрудников по стажу:");
        List<Employee> employeesByAge = directory.findEmployeesByExperience(30);
        for (Employee employee : employeesByAge) {
            System.out.println(employee.getName());
        }


        System.out.println("Поиск телефонных номеров сотрудников:");
        List<String> names = List.of("Masha", "Ivan");
        List<String> phoneNumbers = directory.findEmployeePhoneByName(names);
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        System.out.println("Поиск сотрудника по табельному номеру:");
        Employee employee = directory.findEmployeeByTabNum("125");
        System.out.println(employee.getName());

    }
}