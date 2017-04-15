package com.bridgelabz.studentregistration.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.studentregistration.Model.Student;

@Repository
public class StudentDaoImpl implements StudentDaoInterface

{
	@Autowired
	SessionFactory sessionFactory;

	public int register(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			session.saveOrUpdate(student);
			tr.commit();

			return 1;
		} catch (Exception e) {
			tr.rollback();
			return 0;
		} finally {
			session.close();
		}

	}

	public Object loginValidation(String mail, String password) 
	{

		Session session = sessionFactory.openSession();
		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			String hql = "select id from Student  where email='"+mail+"'and password='"+password+"'";
			
			System.out.println(hql);
			org.hibernate.Query query = session.createQuery(hql);
			
			Integer s = (Integer) query.uniqueResult();
			System.out.println(s);
	
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			return 0;
		} finally {
			session.close();
		}
	}

}
