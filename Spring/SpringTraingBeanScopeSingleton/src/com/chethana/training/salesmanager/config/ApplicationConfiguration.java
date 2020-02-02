package com.chethana.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.chethana.training.salesmanager.repository.EmployeeRepository;
import com.chethana.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.chethana.training.salesmanager.service.EmployeeService;
import com.chethana.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.chethana")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	@Scope("singleton")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
		
		return employeeService;
	}

//	
//		@Bean(name="employeeRepository")
//	    public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();	}
	}
