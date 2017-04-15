package com.bridgelabz.LoginRegUsingRestController.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.LoginRegUsingRestController.dao.UserDaoInter;
import com.bridgelabz.LoginRegUsingRestController.model.Product;
import com.bridgelabz.LoginRegUsingRestController.model.ProductPurchaseTransaction;
import com.bridgelabz.LoginRegUsingRestController.model.User;

public class UserServiceImpl implements UserServiceInter
{
	@Autowired
    private	UserDaoInter userDaoImpl;

	public boolean register(User user) 
	{
	 return	userDaoImpl.register(user);
	}

	 public User login(String mail, String password) 
	 {
		 return userDaoImpl.login(mail,password);
	
	}

	

	public boolean productRegister(Product product) {
		return userDaoImpl.producrRegsiter(product);
	}


	public boolean transaction(ProductPurchaseTransaction productPurchaseTransaction) {
		return userDaoImpl.transaction(productPurchaseTransaction);
	}

}
