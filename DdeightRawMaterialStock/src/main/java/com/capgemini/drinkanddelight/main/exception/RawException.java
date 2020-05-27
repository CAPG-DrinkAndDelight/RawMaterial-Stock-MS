package com.capgemini.drinkanddelight.main.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class RawException {
  private final String msg;
 
  private final HttpStatus httpStatus;
  private final ZonedDateTime timestamp;
public RawException(String msg,  HttpStatus httpStatus, ZonedDateTime timestamp) {
	super();
	this.msg = msg;
	
	this.httpStatus = httpStatus;
	this.timestamp = timestamp;
}
public String getMsg() {
	return msg;
}

public HttpStatus getHttpStatus() {
	return httpStatus;
}
public ZonedDateTime getTimestamp() {
	return timestamp;
}
  
}
