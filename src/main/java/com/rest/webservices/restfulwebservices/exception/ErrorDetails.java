package com.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

public class ErrorDetails {

	//TIMESTAMP
	//ERRORMESSAGE
	//DETAILS
	//STANDARD STANDARD FOR EXCEPTION RESPONSE
	
	private LocalDateTime timestamp;
	private String message;
	private String details;
	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	
	
	
	
}
