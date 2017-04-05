package com.bridgelabz.studentregistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class StudentController
{
	@RequestMapping(value="/registration")
	public ModelAndView registration()
	{
		return new ModelAndView("RegistrationPage");
	}
	
	
	@RequestMapping(value="/login")
	public ModelAndView login()
	{
		return new ModelAndView("LoginPage");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView home()
	{
		return new ModelAndView("HomePage");
	}
	
	
}
