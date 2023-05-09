package com.jsp.spring_first_project.exception;

public class IdNotFoundException extends Exception {
	
	private String message;
	
	

	public IdNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
