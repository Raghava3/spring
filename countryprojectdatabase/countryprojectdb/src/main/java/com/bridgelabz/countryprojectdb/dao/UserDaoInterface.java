package com.bridgelabz.countryprojectdb.dao;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.countryprojectdb.model.User;

public interface UserDaoInterface
{
 public int register(User user);
 public Object loginValidation(String email, String password);
 public User profile(int id);
 public int logout(HttpServletRequest req, HttpServletResponse resp);
 
}
