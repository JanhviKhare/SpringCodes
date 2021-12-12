package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {




	//@PostMapping("/users")
@GetMapping("/user")
	
	//public String printuser(@RequestBody User user) {
	public @ResponseBody User getUser() {
	User user=new User();
		user.setName("janhvi");
		user.setLocation("india");
		user.setAge(20);
		return user;
		
		
		
		
		
		//System.out.println("printing user object: "+user);
		
	//	return"Successful";
		
	}
	

}
