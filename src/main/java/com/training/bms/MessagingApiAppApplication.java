package com.training.bms;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	@GetMapping("weekend")
	public String printGreetings()
	{
		return("hi oracle!!!watsup??");
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		
	}
	

}
