package com.bridgelabz.LoginRegUsingRestController.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.LoginRegUsingRestController.model.Product;

public class ProductDaoImpl implements ProductDaoInter 
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean add(Product product)
    {
		
		try {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(product);
			tr.commit();
			session.close();
			return true;
		    }

		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	
	}

}
