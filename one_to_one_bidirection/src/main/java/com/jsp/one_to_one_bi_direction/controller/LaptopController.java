package com.jsp.one_to_one_bi_direction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.one_to_one_bi_direction.dto.Laptop;
import com.jsp.one_to_one_bi_direction.repository.LaptopRepository;
import com.jsp.one_to_one_bi_direction.service.LaptopService;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;
	
	@Autowired
	private LaptopRepository laptopRepository;
	
	// saveLaptop method
	@PostMapping(value ="/saveLaptop")
	public Laptop saveLaptop(@RequestBody Laptop laptop) {
		return laptopService.saveLaptop(laptop);
	}
	@GetMapping(value = "/getByLaptopName{laptopName}")
	public Laptop getByLaptopName(@PathVariable String laptopName) {
		return laptopRepository.getByLaptopName(laptopName);
	}
}