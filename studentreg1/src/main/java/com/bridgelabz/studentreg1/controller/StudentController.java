package com.bridgelabz.studentreg1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 @Controller
 @RequestMapping("/")
public class StudentController 
{
	/* @RequestMapping("/")
	 public ModelAndView welcome()
	 {
		 return new ModelAndView("welcome");
	 }*/
	 
	 @RequestMapping(value="registration", method=RequestMethod.POST)
	 public ModelAndView registration()
	 {
		 return new ModelAndView("registrationpage");
	 }
	 
	 @RequestMapping(value="/login", method= RequestMethod.POST)
	 public ModelAndView login()
	 {
		 return new ModelAndView("loginpage");
	 }
	 
	
}
