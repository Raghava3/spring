package com.bridgelabz.LoginRegUsingRestController.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.LoginRegUsingRestController.model.User;

@Repository
public class UserDaoImpl implements UserDaoInter {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean register(User user)

	{
		try {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(user);
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

	public User login(String mail, String password) 
	{
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			String hql = "from User where email=:m and password=:p";
			
			Query<User> query = session.createQuery(hql);
			query.setParameter("m", mail);
			query.setParameter("p", password);
			
     User user	=query.uniqueResult();
			System.out.println("user"+user);
			return user ;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User retrive() 
	{
		Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
		
	}

}
