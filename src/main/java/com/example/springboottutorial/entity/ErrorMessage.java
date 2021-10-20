package com.example.springboottutorial.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	
	private HttpStatus status;
	private String message;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ErrorMessage() {
		super();
	}
	
	
}
