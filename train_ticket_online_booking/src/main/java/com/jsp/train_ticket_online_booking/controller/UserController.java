package com.jsp.train_ticket_online_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.train_ticket_online_booking.dto.User;
import com.jsp.train_ticket_online_booking.response.ResponseStructure;
import com.jsp.train_ticket_online_booking.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// saveUser method
	@PostMapping("/saveUser")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

}