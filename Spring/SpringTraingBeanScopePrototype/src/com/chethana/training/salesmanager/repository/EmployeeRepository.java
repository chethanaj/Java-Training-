package com.chethana.training.salesmanager.repository;

import java.util.List;

import com.chethana.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}