package com.bridgeLabz.RestControllerExample.service;

import com.bridgeLabz.RestControllerExample.model.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);

	public Employee login(String mail, String password);

	public int delete(int id);
}
