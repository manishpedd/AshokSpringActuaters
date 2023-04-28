package com.AshokItRestapiSpring.Actuaters.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApi {
	

	@GetMapping("/welcome")
	public ResponseEntity<String>  welcomeMsg(){
		
		//Get messages 
		Map<String, String> messages = appPropertiesConfig.getMessages();
		
		//Get key we will automatically get value by get method
		
		String msgValue = messages.get("welcomeMsg");
		
		return new ResponseEntity<String>(msgValue,HttpStatus.OK);
		
		
		
	}

}
