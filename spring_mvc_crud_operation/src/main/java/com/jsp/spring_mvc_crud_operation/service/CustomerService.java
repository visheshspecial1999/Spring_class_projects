package com.jsp.spring_mvc_crud_operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_mvc_crud_operation.dao.CustomerDao;
import com.jsp.spring_mvc_crud_operation.dto.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	// saveCustomer method
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);

	}

	// getById method
	public Customer getById(int customerId) {
		return customerDao.getById(customerId);
	}

	// updateCustomer method
	public String updateCustomer(Customer customer, int customerId) {
		return customerDao.updateCustomer(customer, customerId);
	}

	// deleteCustomer method
	public void deleteCustomer(int customerId) {
		 customerDao.deleteCustomer(customerId);
	}

	// displayAllCustomer method
	public List<Customer> displayAllCustomer() {
		return customerDao.displayAllCustomer();
	}
}
