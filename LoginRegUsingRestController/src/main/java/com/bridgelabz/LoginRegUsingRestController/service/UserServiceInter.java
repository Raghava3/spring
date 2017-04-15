package com.bridgelabz.LoginRegUsingRestController.service;

import com.bridgelabz.LoginRegUsingRestController.model.User;

public interface UserServiceInter 
{
public boolean register(User user);

public User login(String mail, String password);
}
