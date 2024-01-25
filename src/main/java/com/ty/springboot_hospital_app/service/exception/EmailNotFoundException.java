package com.ty.springboot_hospital_app.service.exception;

public class EmailNotFoundException extends RuntimeException
{
	
	private String message ="Email Not Found";

	public EmailNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
	// TODO Auto-generated method stub
	return message;
	}

	
}
