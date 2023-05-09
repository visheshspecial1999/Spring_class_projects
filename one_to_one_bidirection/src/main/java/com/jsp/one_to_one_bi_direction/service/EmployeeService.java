package com.jsp.one_to_one_bi_direction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.one_to_one_bi_direction.dao.EmployeeDao;
import com.jsp.one_to_one_bi_direction.dto.Employee;
import com.jsp.one_to_one_bi_direction.dto.Laptop;
import com.jsp.one_to_one_bi_direction.repository.LaptopRepository;

@Service
public class EmployeeService {
	
	@Autowired	
	private EmployeeDao employeeDao;
	@Autowired
	private LaptopRepository laptopRepository;
	// saveEmployee method
		public Employee saveEmployee(Employee employee,int laptopId) {
			
			Laptop laptop=laptopRepository.getByLaptopId(laptopId);
			employee.setLaptop(laptop);
			return employeeDao.saveEmployee(employee);
		}
}
