package com.chethana.training.salesmanager.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import com.chethana.training.salesmanager.model.Employee;
import com.chethana.training.salesmanager.repository.EmployeeRepository;



public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	

	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
}

	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
	
	

}
