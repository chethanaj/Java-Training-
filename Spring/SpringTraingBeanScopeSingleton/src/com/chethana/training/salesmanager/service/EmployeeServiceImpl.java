package com.chethana.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chethana.training.salesmanager.model.Employee;
import com.chethana.training.salesmanager.repository.EmployeeRepository;


public class EmployeeServiceImpl implements EmployeeService {
	
	//@Autowired
    EmployeeRepository employeeRepository;

	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	   System.out.println("Overload constructor executed.");
		this.employeeRepository = employeeRepository;
	}
	public EmployeeServiceImpl() {
		   System.out.println("Default constructor executed.");
	}
	

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter executed.");
		this.employeeRepository = employeeRepository;
}

	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
	
	

}
