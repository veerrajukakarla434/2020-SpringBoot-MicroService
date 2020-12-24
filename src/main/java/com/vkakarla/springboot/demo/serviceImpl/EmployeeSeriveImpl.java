package com.vkakarla.springboot.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vkakarla.springboot.demo.model.Employee;
import com.vkakarla.springboot.demo.service.EmployeeService;

@Service
public class EmployeeSeriveImpl implements EmployeeService {
	
	@Override
	public Employee getEmployeeDetailsBySSN(String ssn) {
		
		Employee employee = new Employee();
		
		employee.setSsn(ssn);
		employee.setFirstName("Veerraju");
		employee.setLastName("Kakarla");
		employee.setEmail("abcd@gmail.com");
		
		return employee;
	}

	@Override
	public String getEmployeeName(String ssn) {
		  if(ssn.equals("123")) {
			  return "Veerraju";
		  }
		  if(ssn.equals("456")) {
			  return "Gayatrhi";
		  }
		  return null;
	}

	@Override
	public List<Employee> getEmployees() {
		
		List<Employee> list = new ArrayList<>();
		
        Employee employee = new Employee();
		employee.setSsn("123");
		employee.setFirstName("Veerraju");
		employee.setLastName("Kakarla");
		employee.setEmail("abcd@gmail.com");
		
		Employee employee1 = new Employee();
		employee1.setSsn("456");
		employee1.setFirstName("Gayatri");
		employee1.setLastName("Kakarla");
		employee1.setEmail("def@gmail.com");
		
		list.add(employee);
		list.add(employee1);
		
		return list;
	}
	
}
