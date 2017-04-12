package com.bridgelabz.countryprojectdb.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.countryprojectdb.dao.UserDaoInterface;
import com.bridgelabz.countryprojectdb.model.User;

public class UserServiceImpl implements UserServiceInterface
{
	@Autowired
	UserDaoInterface userDaoInterface;
	
	public int register(User user)
	{
	int n=userDaoInterface.register(user);
	return n;
	}

	public Object loginValidation(String email, String password)
	{
		
		Object n=userDaoInterface.loginValidation(email, password);
		return n;
		
	}

	
	public User profile(int id) {
		
		return 	userDaoInterface.profile(id);
	
	}

	@Override
	public int logout(HttpServletRequest req, HttpServletResponse resp) {
		return 	userDaoInterface.logout(req,resp);
	}

}
