package com.bridgelabz.countryprojectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.bridgelabz.countryprojectdb.model.Country;
import com.bridgelabz.countryprojectdb.model.User;
import com.bridgelabz.countryprojectdb.service.CountryServiceInterface;

@Controller
@EnableWebMvc
public class CountryControl 
{
	@Autowired
	CountryServiceInterface countryServiceInterface;
	
	@RequestMapping("/countryList")
	public ModelAndView viewList()
	{
		
		List<Country> topasstopage=countryServiceInterface.countryList();
	    return new ModelAndView("CountryList","List",topasstopage);
	
	}
	// this method to update to database
	@RequestMapping("/updateCountry")
	public ModelAndView updatePage()
	{
	
		return new ModelAndView("UpdatePage");
	}

	@RequestMapping("/updateMethod")
	public String updateMethod(Country country)
	{
		
		countryServiceInterface.update(country);
		return "redirect:/home"; //new ModelAndView(":redirectHomePage");
	 }
	
	
	
	@RequestMapping("/countryname")
	public ModelAndView countryDetails(@RequestParam("id") String name)
	{
	/*	User l = userServiceInterface.profile(id);
        return  new 	ModelAndView("ProfilePage","ProfileDetails",l);*/
		
		 Country country=countryServiceInterface.countryDetails(name);
		 return new ModelAndView("CountryDetails","countrydetails",country);
		 
	}
	
	
	@RequestMapping("/delete")
	public ModelAndView delete()
	{
		
		List<Country> topasstopage=countryServiceInterface.countryList();
		return new ModelAndView("DeleteCountry","List",topasstopage);
	}
	
	@Transactional
	@RequestMapping(value="/deletecountry")
	public ModelAndView deleteFromTable(@RequestParam("id") String name)
	{
		 int country=countryServiceInterface.deleteFromTable(name);
		 return new ModelAndView("CountryDetails");
	}
	
	
	@RequestMapping("/countryList1")
	public ModelAndView viewList1()
	{
		List<Country> topasstopage=countryServiceInterface.countryList();
	
	return new ModelAndView("CountryList1","List",topasstopage);
	
	}
	
	
	@RequestMapping(value="/countryname1")
	public ModelAndView countryDetails1(@RequestParam("id") String name)
	{
		
		 Country country=countryServiceInterface.countryDetails(name);
		 return new ModelAndView("CountryDetails1","countrydetails",country);
		 
	}

	@RequestMapping("/homepage")
	public String homepage()
	{
		
		return "redirect:/home1";
	}
	
	@RequestMapping(value="/home1")
	public ModelAndView profile()
	{
		return  new ModelAndView("HomePage");
		
	}
	
	}
	
	

