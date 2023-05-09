package com.jsp.one_to_one_bi_direction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.one_to_one_bi_direction.dao.LaptopDao;
import com.jsp.one_to_one_bi_direction.dto.Laptop;

@Service
public class LaptopService {
	
	@Autowired
	LaptopDao laptopDao;
	// saveLaptop method
		public Laptop saveLaptop(Laptop laptop) {
			return laptopDao.saveLaptop(laptop);
		}

}