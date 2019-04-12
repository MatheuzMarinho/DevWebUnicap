package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHand extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(ExceptionResponse.class)
	public ResponseEntity<?> exception(ExceptionResponse ex){
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex.getMessage());
	}

}
