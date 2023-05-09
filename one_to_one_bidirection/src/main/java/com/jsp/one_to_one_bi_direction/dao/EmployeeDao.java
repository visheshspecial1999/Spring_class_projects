package com.jsp.one_to_one_bi_direction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.one_to_one_bi_direction.dto.Employee;
import com.jsp.one_to_one_bi_direction.repository.EmployeeRepository;
@Repository
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// saveEmployee method
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
}
