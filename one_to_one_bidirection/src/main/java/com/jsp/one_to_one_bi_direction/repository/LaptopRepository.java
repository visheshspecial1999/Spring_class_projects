package com.jsp.one_to_one_bi_direction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jsp.one_to_one_bi_direction.dto.Laptop;

@EnableJpaRepositories
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
	
	Laptop getByLaptopId(int laptopId);
	Laptop getByLaptopName(String laptopName);
}
