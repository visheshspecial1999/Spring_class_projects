package com.jsp.spring_first_project.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ResponseStructrure<T> {
	
	private int statusCode;
	private String statusMessage;
	private T data;

}
