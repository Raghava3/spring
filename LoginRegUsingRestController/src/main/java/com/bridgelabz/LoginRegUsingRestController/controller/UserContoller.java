package com.bridgelabz.LoginRegUsingRestController.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.LoginRegUsingRestController.model.User;
import com.bridgelabz.LoginRegUsingRestController.service.UserServiceInter;

@RestController
public class UserContoller 
{

	@Autowired
	UserServiceInter userServiceInter;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody User user, HttpServletRequest req,HttpServletResponse resp)
	{
		 boolean  result=userServiceInter.register(user);
		
		 if(result)
		 {
			 return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
		 }
		 else
		 {
			 return new ResponseEntity<String>("not sucess",HttpStatus.METHOD_NOT_ALLOWED);
		 }
	}
	
	
	
/*	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody Map<String, String> loginMap, HttpServletRequest request,
			HttpServletResponse response) {

		HttpSession session = request.getSession();
		
		System.out.println(loginMap.get("email"));
		System.out.println(loginMap.get("password"));

		User n = userServiceInter.login(loginMap.get("email"), loginMap.get("password"));

	//	System.out.println(loginMap.get("mail") + "  " + loginMap.get("password"));
		

		if (n!=null)
		{
			return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
		} 
		else 
		{
			return new ResponseEntity<String>("invalid creadentials", HttpStatus.NOT_ACCEPTABLE);
		}
	}*/
}
	

