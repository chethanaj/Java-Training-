package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> getAllEmployees();

}
