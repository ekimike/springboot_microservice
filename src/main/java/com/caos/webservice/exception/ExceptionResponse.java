package com.caos.webservice.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timeStamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	
	
}
