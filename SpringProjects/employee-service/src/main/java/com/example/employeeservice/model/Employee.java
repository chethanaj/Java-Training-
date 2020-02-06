package com.example.employeeservice.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int marks;

    public Employee(String name, int marks) {
        this.name = name;
        this.marks = marks;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Sam", 25));
        employeeList.add(new Employee("Ann", 32));
        employeeList.add(new Employee("Mike", 12));
        employeeList.add(new Employee("Diana", 46));
        employeeList.add(new Employee("Johny", 44));
        employeeList.add(new Employee("Zee", 68));

        return employeeList;
    }
}
