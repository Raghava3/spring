package com.bridgelabz.LoginRegUsingRestController.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.LoginRegUsingRestController.dao.ProductDaoInter;
import com.bridgelabz.LoginRegUsingRestController.model.Product;

public class ProductServiceImpl  implements ProductServiceInter
{
    @Autowired
  	ProductDaoInter productDaoImpl; 
    public boolean add(Product product)
	{
	return   productDaoImpl.add(product);
	}

}
