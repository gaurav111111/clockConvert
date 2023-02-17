package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.ClockPojo;
import com.example.demo.service.ClockService;
import com.example.demo.utils.Constant;
import com.example.demo.utils.Message;

@Service
public class ClockServiceImpl implements ClockService{

	Logger logger = LoggerFactory.getLogger(ClockServiceImpl.class);
	
	@Override
	public Message timeConvertInWords(ClockPojo cp) {
		
		Message msg = new Message();
		try {
			String time[]=cp.getTime().split(":");
			int hour=Integer.parseInt(time[0]);
			int min=Integer.parseInt(time[1]);
			
			String result= "It's "+Constant.hour_mint[hour]+" "+Constant.hour_mint[min];
			
			msg.setStatusCode(200);
			msg.setMessage("Success");
			msg.setResponse(result);
		}catch(Exception e) {
			 logger.error("timeConvertInWords :"+e.getMessage());
		}
		
		
		return msg;
	}

}
