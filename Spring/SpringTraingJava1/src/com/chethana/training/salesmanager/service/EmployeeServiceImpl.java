package com.chethana.training.salesmanager.service;

import java.util.List;
import com.chethana.training.salesmanager.model.Employee;
import com.chethana.training.salesmanager.repository.EmployeeRepository;


public class EmployeeServiceImpl implements EmployeeService {
	
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
