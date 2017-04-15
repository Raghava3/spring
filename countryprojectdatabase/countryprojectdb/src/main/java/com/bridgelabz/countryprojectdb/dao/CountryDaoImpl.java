package com.bridgelabz.countryprojectdb.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.countryprojectdb.model.Country;
import com.bridgelabz.countryprojectdb.model.User;

@Repository
@Transactional
public class CountryDaoImpl implements CountryDaoInterface {

	@Autowired
	SessionFactory sessionFactory;

	
	public void update(Country country) 
	{
		
		Session session = sessionFactory.openSession();
		Transaction tr = null;
		
        try
        {
			tr = session.beginTransaction();
             session.save(country);
             tr.commit();
          
	    }
        catch (Exception e)
        {
			
		} 
        finally 
        {
			session.close();
		}

     }

	public List<Country> countryList() 
	{
		Session session = sessionFactory.openSession();
		
		
		  List<Country> countryList = session.createQuery("from Country").getResultList();
		  session.close();
		  
		
		  
   	      return countryList;  
   	      
}

	@Override
	public Country countryDetails(String name) {
		Session session = sessionFactory.openSession();
		Transaction tr = null;
		
		  Query query = session.createQuery("from Country where name=:name");
		  /*query.executeUpdate();*/
		  query.setParameter("name", name);
		  Country country= (Country) query.uniqueResult();
		  
		  return country; 
		
	}

	
	@Override
	public int deleteFromTable(String name) {
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
	
		  Query query = session.createQuery("delete from Country where name='"+name+"'");
	//	  query.setParameter("name", name);
		 int country=query.executeUpdate();

	//	  Country country= (Country) query.uniqueResult();
		  tr.commit();
		  
		  return country; 
		
	}

	
}
