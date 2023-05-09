package com.jsp.one_to_one_bi_direction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.one_to_one_bi_direction.dto.Employee;
import com.jsp.one_to_one_bi_direction.repository.EmployeeRepository;
import com.jsp.one_to_one_bi_direction.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmployeeService employeeService;
	
	// saveEmployee method
	@PostMapping(value = "/saveEmployee/{laptopId}")
	public Employee saveEmployee(@RequestBody Employee employee,@PathVariable int laptopId) {
		return employeeService.saveEmployee(employee,laptopId);
	}
}