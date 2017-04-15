package com.bridgelabz.countryprojectdb.dao;

import java.util.List;

import com.bridgelabz.countryprojectdb.model.Country;

public interface CountryDaoInterface 
{

	public void update(Country  country);
	
	public List<Country> countryList();
	
	public Country countryDetails(String name);
	
	public  int deleteFromTable (String name);
}
