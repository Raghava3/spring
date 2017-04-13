package com.bridgeLabz.RestControllerExample.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.RestControllerExample.model.Employee;
import com.bridgeLabz.RestControllerExample.service.EmployeeService;

@RestController
public class EmployeeController

{

	@Autowired
	EmployeeService employeeService;

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> delete(@PathVariable("id") int id, HttpServletRequest request,
			HttpServletResponse response) {
		int result = employeeService.delete(id);
		if (result == 0) 
		{
			return new ResponseEntity<String>("not deleted", HttpStatus.NOT_FOUND);

		} else {
			return new ResponseEntity<String>("deleted", HttpStatus.ACCEPTED);
		}

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody Employee employee) {
		boolean result = employeeService.addEmployee(employee);
		if (result) 
		{
			return new ResponseEntity<String>("sucessfullyregistered", HttpStatus.ACCEPTED);
		} 
		else 
		{
			return new ResponseEntity<String>("not sucessfull", HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody Map<String, String> loginMap, HttpServletRequest request,
			HttpServletResponse response) {

		HttpSession session = request.getSession();

		Employee employee = employeeService.login(loginMap.get("mail"), loginMap.get("password"));

	//	System.out.println(loginMap.get("mail") + "  " + loginMap.get("password"));
		

		if (employee!=null)
		{
			return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
		} 
		else 
		{
			return new ResponseEntity<String>("invalid creadentials", HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
