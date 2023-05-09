package com.jsp.spring_first_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.spring_first_project.dto.Mobile;

@Component
public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	
}