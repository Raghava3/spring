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

import com.bridgelabz.LoginRegUsingRestController.model.Product;
import com.bridgelabz.LoginRegUsingRestController.model.ProductPurchaseTransaction;
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
	
	@RequestMapping(value="/productCreation", method=RequestMethod.POST)
	public ResponseEntity<String> productCreation(@RequestBody Product product, HttpServletRequest req,HttpServletResponse resp)
	{
		boolean  result = userServiceInter.productRegister(product);
		
		 if(result)
		 {
			 return new ResponseEntity<String>("{status:'success', 'message':'Data saved!'}", HttpStatus.OK);
		 }
		 else
		 {
			 return new ResponseEntity<String>("{status:'failed', 'message':'Data notsaved!'}", HttpStatus.EXPECTATION_FAILED);
		 }
	}
	
	@RequestMapping(value="/transaction", method=RequestMethod.POST)
	public ResponseEntity<String> transaction(@RequestBody ProductPurchaseTransaction productPurchaseTransaction, HttpServletRequest req,HttpServletResponse resp)
	{
		 boolean  result=userServiceInter.transaction(productPurchaseTransaction);  
		
		 if(result)
		 {
			 return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
		 }
		 else
		 {
			 return new ResponseEntity<String>("not sucess",HttpStatus.METHOD_NOT_ALLOWED);
		 }
	}
	
	
	

}
	

