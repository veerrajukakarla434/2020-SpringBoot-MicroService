package com.vkakarla.springboot.demo.service;

import java.util.List;

import com.vkakarla.springboot.demo.model.Employee;

public interface EmployeeService {
    
	 public String getEmployeeName(String ssn);
	 
	 public Employee getEmployeeDetailsBySSN(String ssn);
	 
	 public List<Employee> getEmployees();
}
