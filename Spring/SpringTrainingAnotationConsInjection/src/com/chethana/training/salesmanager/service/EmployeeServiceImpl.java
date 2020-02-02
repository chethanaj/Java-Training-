package com.chethana.training.salesmanager.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chethana.training.salesmanager.model.Employee;
import com.chethana.training.salesmanager.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	
	 EmployeeRepository employeeRepository;
	 
	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed.");
	}
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded constructor executed.");
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired.");
		this.employeeRepository = employeeRepository;
}

	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
	
	

}
