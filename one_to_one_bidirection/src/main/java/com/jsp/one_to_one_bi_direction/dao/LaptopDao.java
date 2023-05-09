package com.jsp.one_to_one_bi_direction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.one_to_one_bi_direction.dto.Laptop;
import com.jsp.one_to_one_bi_direction.repository.LaptopRepository;

@Repository
public class LaptopDao {
	@Autowired
	private LaptopRepository laptopRepository ;
	
	// saveLaptop method
	public Laptop saveLaptop(Laptop laptop) {
		return laptopRepository.save(laptop);
	}
}