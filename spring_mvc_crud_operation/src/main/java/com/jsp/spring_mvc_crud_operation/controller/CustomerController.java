package com.jsp.spring_mvc_crud_operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc_crud_operation.dto.Customer;
import com.jsp.spring_mvc_crud_operation.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/")
	public ModelAndView getStringData() {
		ModelAndView andView = new ModelAndView("register.jsp");
		andView.addObject("customerObject", new Customer());
		return andView;
	}

	@PostMapping(value = "/saveCustomer")
	public ModelAndView saveCustomer(Customer customer) {
		customerService.saveCustomer(customer);
		return new ModelAndView("/");
	}
}