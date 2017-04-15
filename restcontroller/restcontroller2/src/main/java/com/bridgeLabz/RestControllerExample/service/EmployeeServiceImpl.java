package com.bridgeLabz.RestControllerExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeLabz.RestControllerExample.dao.EmployeeDAO;
import com.bridgeLabz.RestControllerExample.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public boolean addEmployee(Employee employee) {
		
		return employeeDAO.addEmployee(employee);
	}

	public Employee login(String mail, String password) {
		return employeeDAO.login(mail,password);
	}

}
