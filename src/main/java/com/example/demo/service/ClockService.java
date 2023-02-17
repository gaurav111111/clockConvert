package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.ClockPojo;
import com.example.demo.utils.Message;


public interface ClockService {
	
	abstract Message timeConvertInWords(ClockPojo cp);
}
