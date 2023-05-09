package com.jsp.spring_first_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringFirstDemoController {
	
	@GetMapping(value="/printMessage")
	public String  printMessage() {
		return "hi welcome to first spring demo project";
	}
	
	@GetMapping(value = "/printMessage1")
	public String printMessage(String st) {
		return "In this project we are using method overloading";
	}
}