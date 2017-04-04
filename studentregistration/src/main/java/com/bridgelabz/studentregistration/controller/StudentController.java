package com.bridgelabz.studentregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.studentregistration.model.Student;

import com.bridgelabz.studentregistration.service.StudentServiceInterface;

@Controller
@RequestMapping("/")
public class StudentController 
{

	@Autowired
    private	StudentServiceInterface studentServiceInterface;
	
@RequestMapping(value="/registration",method=RequestMethod.POST)	
public ModelAndView registration()
{
	
	return new ModelAndView("RegistrationPage");
	
}

@RequestMapping(value="/login",method=RequestMethod.POST)	
public ModelAndView login(Student student)
{
  int n= studentServiceInterface.register(student);
	if(n==1)
	{
	return new ModelAndView("LoginPage");
	}
	else
	{
		return new ModelAndView("RegistrationPagePage");
	}
}

@RequestMapping(value="/home")	
public ModelAndView welcome()
{
	return new ModelAndView("HomePage");
	
}

}
