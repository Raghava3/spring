package com.bridgelabz.countryprojectdb.dao;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.countryprojectdb.model.User;

@Repository
public class UserDaoImpl implements UserDaoInterface 
{
 
	@Autowired
	SessionFactory sessionFactory;
	
	public int register(User user)
	{
		Session session = sessionFactory.openSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			session.saveOrUpdate(user);
			tr.commit();

			return 1;
		} catch (Exception e) {
			tr.rollback();
			return 0;
		} finally {
			session.close();
		}
	
		
	}

	public Object loginValidation(String email, String password)
	{
		
		Session session = sessionFactory.openSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			String hql = "select id from User where email='"+email+"'and password='"+password+"'";
			org.hibernate.Query query = session.createQuery(hql);
			Object s =  query.uniqueResult();
	        return s;
		} catch (Exception e) {
			
		e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
		
		
	}

	@Override
	public User profile(int id) 
	{

		Session session = sessionFactory.openSession();
		Transaction tr = null;
		
		  Query query = session.createQuery("from User where email=:id");
		  /*query.executeUpdate();*/
		  query.setParameter("id", id);
		 User user= (User) query.uniqueResult();
		  System.out.println(user.getEmail());
		  return user; 
		  
		  
		  
	}

	@Override
	public int logout(HttpServletRequest req,HttpServletResponse resp)
	{
		HttpSession session=req.getSession();
		String email=(String)session.getAttribute("Email");
		if(email!=null)
		{
			session.invalidate();
			return 1;
		}
		else{
		return 0;
		}
		}
}
