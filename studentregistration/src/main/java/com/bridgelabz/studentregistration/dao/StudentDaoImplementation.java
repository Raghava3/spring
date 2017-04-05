package com.bridgelabz.studentregistration.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.studentregistration.model.Student;

public class StudentDaoImplementation implements StudentDaoInterface 
{
	@Autowired 
	private SessionFactory sessionFactory;

	@Override
	public int register(Student student) 
	{
	
		
		
		Session session=sessionFactory.openSession();
		Transaction tr = null;
		try{
			tr = session.beginTransaction();
			session.saveOrUpdate(student);
			tr.commit();
			
			return 1;
		}
		catch(Exception e)
		{
			tr.rollback();
			return 0;
		}
		finally {
			session.close();
		}
		
		
	}
	
}
