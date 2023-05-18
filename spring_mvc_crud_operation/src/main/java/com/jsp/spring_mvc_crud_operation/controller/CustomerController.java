package com.jsp.spring_mvc_crud_operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "/displayCustomer")
	public ModelAndView getAllCustomer() {
		List<Customer> customers=customerService.displayAllCustomer();
//		for (Customer customer : customers) {
//			System.out.println(customer.getCustomerEmail());
//		}
		ModelAndView andView=new ModelAndView("display.jsp");
		andView.addObject("customerList", customers);
		return andView;
	}
	
	
// deleteCustomer controller
	@RequestMapping(value = "/delete")
	public ModelAndView deleteCustomer(@RequestParam int customerId) {
		customerService.deleteCustomer(customerId);
		return new ModelAndView("/displayCustomer");
	}
	/*
	 * first fetch the data by passing customerId and open the update form from
	 * model and view controller and add the fetched data in the open form
	 */
	@RequestMapping(value ="/update")
	public ModelAndView openUpdateController(Customer customer,int customerId) {
		Customer customer2=customerService.getById(customerId);
		return new ModelAndView("update.jsp").addObject("customerUpdate", customer2);
	}
	
	/*
	 * now modify data in opened form and call the update method to save the data
	 */
	@PostMapping(value = "/updateCustomer")
	public ModelAndView updateCustomer(Customer customer) {
		customerService.updateCustomer(customer, customer.getCustomerId());
		return new ModelAndView("/displayCustomer");
	}
}