package com.jsp.spring_first_project.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jsp.spring_first_project.dto.ResponseStructrure;

@ControllerAdvice
public class ApplicationExceptionController {
	
	@Autowired
	ResponseStructrure<String> responseStructrure;
	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<ResponseStructrure<String>> noIdExceptionHandler(IdNotFoundException exception){
		
		responseStructrure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructrure.setStatusMessage("No data found");
		responseStructrure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructrure<String>>(responseStructrure,HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()));
	}
}