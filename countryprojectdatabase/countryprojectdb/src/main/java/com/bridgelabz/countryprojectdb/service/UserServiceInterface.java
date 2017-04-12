package com.bridgelabz.countryprojectdb.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.countryprojectdb.model.User;

public interface UserServiceInterface 
{
	
	public int register(User user);

	public Object loginValidation(String mail,String password);
	
	public User profile(int id);

	public int logout(HttpServletRequest req, HttpServletResponse resp);
}
