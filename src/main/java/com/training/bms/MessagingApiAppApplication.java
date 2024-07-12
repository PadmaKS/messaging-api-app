package com.training.bms;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
public class MessagingApiAppApplication {
	@GetMapping("weekend")
	public String printGreetings()
	{
		return("hi oracle!!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		
	}
	

}
