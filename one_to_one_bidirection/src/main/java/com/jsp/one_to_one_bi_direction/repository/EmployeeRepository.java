package com.jsp.one_to_one_bi_direction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.one_to_one_bi_direction.dto.Employee;
@Component
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
