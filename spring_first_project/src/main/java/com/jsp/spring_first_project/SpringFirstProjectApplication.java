package com.jsp.spring_first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My First Spring Boot API", description = "this is spring boot project ", version = "1.0.0"))
public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstProjectApplication.class, args);
	}
}