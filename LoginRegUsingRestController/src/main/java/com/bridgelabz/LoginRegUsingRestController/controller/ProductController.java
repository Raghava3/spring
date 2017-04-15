/*package com.bridgelabz.LoginRegUsingRestController.controller;

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
import com.bridgelabz.LoginRegUsingRestController.service.ProductServiceInter;

@RestController
public class ProductController {
	@Autowired
	ProductServiceInter productServiceInter;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<String> add(@RequestBody Product product, HttpServletRequest req,HttpServletResponse resp)
	{
		 boolean  result=productServiceInter.add(product);
		
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
*/