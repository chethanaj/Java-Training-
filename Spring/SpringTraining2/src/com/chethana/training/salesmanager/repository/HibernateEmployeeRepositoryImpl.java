package com.chethana.training.salesmanager.repository;

import com.chethana.training.salesmanager.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		employee.setEmployeeName("Chethana");
		employee.setEmployeeLocation("Moratuwa");
		employees.add(employee);
		return employees;
	}

}
