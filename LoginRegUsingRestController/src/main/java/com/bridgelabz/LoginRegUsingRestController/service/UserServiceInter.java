package com.bridgelabz.LoginRegUsingRestController.service;

import com.bridgelabz.LoginRegUsingRestController.model.Product;
import com.bridgelabz.LoginRegUsingRestController.model.ProductPurchaseTransaction;
import com.bridgelabz.LoginRegUsingRestController.model.User;

public interface UserServiceInter 
{
public boolean register(User user);

public User login(String mail, String password);

public boolean productRegister(Product product);

public boolean transaction(ProductPurchaseTransaction productPurchaseTransaction);
}
