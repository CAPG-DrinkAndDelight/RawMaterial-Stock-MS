package com.capgemini.drinkanddelight.main.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class StockExceptionHandler {
	
	@ExceptionHandler(value= {RawStockNotFoundException.class})
public ResponseEntity<Object> exp(RawStockNotFoundException e){
	HttpStatus badrequest=HttpStatus.BAD_REQUEST;
	RawException rawException = new RawException(
			e.getMessage(),
			
			badrequest,
			
			ZonedDateTime.now(ZoneId.of("Z"))
			
			);
	return new ResponseEntity<>(rawException,badrequest);
	
}
}
