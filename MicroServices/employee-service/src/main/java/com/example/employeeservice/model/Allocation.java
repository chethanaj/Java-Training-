package com.example.employeeservice.model;

import lombok.Data;

@Data
public class Allocation {

    private Integer id;
    private String startDate;
    private String endDate;
    private String projectCode;

    private Integer empId;
    private Employee employee;

}
