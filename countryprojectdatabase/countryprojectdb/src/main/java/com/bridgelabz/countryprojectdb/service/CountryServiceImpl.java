package com.bridgelabz.countryprojectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.countryprojectdb.dao.CountryDaoInterface;
import com.bridgelabz.countryprojectdb.model.Country;

public class CountryServiceImpl  implements CountryServiceInterface
{
 @Autowired
 CountryDaoInterface countryDaoInterface;
	
	
	
	
	public List<Country> countryList()
	{
	//calling the dao object and list method
		List<Country> listtopass=countryDaoInterface.countryList();
	    return listtopass;
	}



	public Country countryDetails(String name) 
	{
	Country country=countryDaoInterface.countryDetails(name);
	 
	return country;
	
	
	}


	@Override
	public int deleteFromTable(String name) {
		int country=countryDaoInterface.deleteFromTable(name);
		 
		return country;
	}



	@Override
	public void update(Country country) {
		
	 countryDaoInterface.update(country);
	}





}
