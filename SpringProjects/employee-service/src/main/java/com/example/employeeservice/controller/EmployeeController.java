package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@RestController
@RequestMapping("/services")
@XmlRootElement
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getEmployees(){

        return Employee.getAllEmployees();
    }

}
