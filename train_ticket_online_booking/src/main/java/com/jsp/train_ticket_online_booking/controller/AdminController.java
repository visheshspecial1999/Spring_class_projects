package com.jsp.train_ticket_online_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.train_ticket_online_booking.dto.Admin;
import com.jsp.train_ticket_online_booking.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	// registerAdmin method
			@PostMapping(value="/registerAdmin")
			public Admin registerAdmin(@RequestBody Admin admin) {
			Admin admin2	=adminService.registerAdmin(admin);
			if(admin2!=null) {
				return admin2;
			}
			else {
				return null;
			}
			}
			
			// login admin with adminName and Password
			@GetMapping("/loginAdmin/{adminName}/{adminPassword}")
			public Admin loginAdmin(@PathVariable String adminName,@PathVariable String adminPassword) {
				Admin admin=adminService.loginAdmin( adminName, adminPassword);
				if(admin!=null) {
					return admin;
				}
				else {
					return null;
				}
			}
}