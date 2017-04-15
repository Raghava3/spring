package com.bridgelabz.countryprojectdb.service;

import java.util.List;

import com.bridgelabz.countryprojectdb.model.Country;

public interface CountryServiceInterface 
{
	public void update(Country country);
	
	public List<Country> countryList();
	
	public  Country countryDetails (String name);

	public  int deleteFromTable (String name);
	

}
