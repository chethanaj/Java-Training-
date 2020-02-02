package com.chethana.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.chethana.training.salesmanager.repository.EmployeeRepository;
import com.chethana.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.chethana.training.salesmanager.service.EmployeeService;
import com.chethana.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.chethana")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
		
		return employeeService;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	}
