package com.vkakarla.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vkakarla.springboot.demo.model.Employee;
import com.vkakarla.springboot.demo.service.EmployeeService;

@RestController
@RequestMapping("employee-module")
public class EmployeeController {


	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/{ssn}")
	public ResponseEntity<Object> getEmployeeName(@PathVariable String ssn) {

		String str = null;
		str = employeeService.getEmployeeName(ssn);
		if (str == null) {
			return new ResponseEntity<Object>("Bad Request - Name not found for given SSN " +ssn, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(str, HttpStatus.OK);
	}

	@GetMapping(value = "details/{ssn}")
	public ResponseEntity<Object> getEmployeeDetailsBySSN(@PathVariable String ssn) {
		
		Employee employee = null;
		employee = employeeService.getEmployeeDetailsBySSN(ssn);
		return new ResponseEntity<Object>(employee,HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<Object> getEmployees() {
		
		List<Employee> employeeList = null;
		employeeList = employeeService.getEmployees();
		return new ResponseEntity<Object>(employeeList,HttpStatus.OK);
	}

}
