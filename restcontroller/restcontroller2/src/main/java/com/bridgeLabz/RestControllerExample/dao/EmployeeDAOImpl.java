package com.bridgeLabz.RestControllerExample.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeLabz.RestControllerExample.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addEmployee(Employee employee) {
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
			session.close();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Employee login(String mail, String password) {
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			String hql = "from Employee where mail=:m and password=:p";
			
			Query query = session.createQuery(hql);
			query.setParameter("m", mail);
			query.setParameter("p", password);
			Employee employee = (Employee) query.uniqueResult();
			
			return employee;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
