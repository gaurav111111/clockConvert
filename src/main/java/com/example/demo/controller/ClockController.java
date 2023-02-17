package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.globalExceptionHandler.TimeNotfoundException;
import com.example.demo.pojo.*;
import com.example.demo.service.ClockService;
import com.example.demo.utils.Message;

@RestController
public class ClockController {
	
	@Autowired
	ClockService clockService;

	@PostMapping("/clockConvert")
	public ResponseEntity<Message> getTimeInWords(@RequestBody ClockPojo cp) {
		 if(cp.getTime().isEmpty())throw new TimeNotfoundException();
		return new ResponseEntity<>(clockService.timeConvertInWords(cp), HttpStatus.OK);
	}
	
}
