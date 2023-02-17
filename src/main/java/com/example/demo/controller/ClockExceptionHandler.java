package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.globalExceptionHandler.TimeNotfoundException;

@ControllerAdvice
public class ClockExceptionHandler {

	 @ExceptionHandler(value = TimeNotfoundException.class)
	   public ResponseEntity<Object> exception(TimeNotfoundException exception) {
	      return new ResponseEntity<>("Time not found", HttpStatus.NOT_FOUND);
	   }
}
