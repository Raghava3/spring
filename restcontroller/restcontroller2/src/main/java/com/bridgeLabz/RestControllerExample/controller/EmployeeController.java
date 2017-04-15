package com.bridgeLabz.RestControllerExample.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.RestControllerExample.Response.Response;
import com.bridgeLabz.RestControllerExample.model.Employee;
import com.bridgeLabz.RestControllerExample.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Response register(@RequestBody Employee employee) {
		
		boolean result = employeeService.addEmployee(employee);
		
		if(result) {
			Response response =new Response();
			response.setStatus(1);
			response.setMessage("Registration completed");
			return response;
		}
		else {
			Response response =new Response();
			response.setStatus(-1);
			response.setMessage("Not completed");
			return response;
		}
		
	}
	
	
	@RequestMapping(value= "/login" , method = RequestMethod.POST)
	public Response login(@RequestBody Map<String , String> loginMap,HttpServletRequest request,HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		Employee employee = employeeService.login(loginMap.get("mail"),loginMap.get("password"));
		
		System.out.println(loginMap.get("mail")+"  "+loginMap.get("password"));
		System.out.println("hai");
		
		if(employee != null) {
			Response response1 = new Response();
			response1.setStatus(1);
			response1.setMessage("Login Completed");
			return response1;
		}
		else {
			Response response1 = new Response();
			response1.setStatus(-1);
			response1.setMessage("Invali ID or Passward");
			return response1;
		}
		
		
	}
	
}
