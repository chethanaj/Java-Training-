package com.chethana.training.salesmanager.main;

import java.util.List;

import com.chethana.training.salesmanager.model.Employee;
import com.chethana.training.salesmanager.service.EmployeeService;
import com.chethana.training.salesmanager.service.EmployeeServiceImpl;



public class Main {
	
	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		List<Employee> employees=employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName()+ " at "+ employee.getEmployeeLocation());
		}
	}

}
