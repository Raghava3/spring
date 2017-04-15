package com.bridgelabz.LoginRegUsingRestController.dao;

import com.bridgelabz.LoginRegUsingRestController.model.Product;
import com.bridgelabz.LoginRegUsingRestController.model.ProductPurchaseTransaction;
import com.bridgelabz.LoginRegUsingRestController.model.User;

public interface UserDaoInter 
{
	public boolean register(User user);

	public User login(String mail, String password);

    public boolean producrRegsiter(Product product);

    public boolean transaction(ProductPurchaseTransaction productPurchaseTransaction);

	
}
