package com.bridgeLabz.RestControllerExample.dao;

import com.bridgeLabz.RestControllerExample.model.Employee;

public interface EmployeeDAO {

	public boolean addEmployee(Employee employee);

	public Employee login(String mail, String password);

}
