package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory () {
        employees = new ArrayList<>();
    }

    public List<Employee> findEmployeesByExperience(int age){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> findEmployeePhoneByName(List<String> names) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            for (String name : names) {
                if (employee.getName().equals(name)) {
                    result.add(employee.getPhoneNumber());
                }
            }
        }
        return result;
    }

    public Employee findEmployeeByTabNum(String tabNum){
        for (Employee employee : employees) {
            if (employee.getTabNumber().equals(tabNum)) {
                return employee;
            }
        }
        return null;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
