package com.jsp.train_ticket_online_booking.response;

import org.springframework.stereotype.Component;

@Component
@lombok.Data
public class ResponseStructure<T> {
	
	private int statusCode;
	private String message;
	private String description;
	private T Data;
	

}
