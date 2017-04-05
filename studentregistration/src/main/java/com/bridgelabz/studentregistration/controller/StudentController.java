package com.bridgelabz.studentregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.studentregistration.Model.Student;
import com.bridgelabz.studentregistration.service.StudentServiceInterface;

@Controller
@RequestMapping("/")
public class StudentController {

	//this is correct program
	
	@Autowired
	StudentServiceInterface studentServiceInterface;

	@RequestMapping(value = "/registrationpage", method = RequestMethod.POST)
	public ModelAndView registrationpage() {
		return new ModelAndView("RegistrationPage");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(Student student) {
		int n = studentServiceInterface.register(student);

		if (n == 1) {

			return new ModelAndView("LoginPage");

		} else {
			String msg = "registration failed please update again";
			return new ModelAndView("RegistrationPage", "msg", msg);
		}

	}

	@RequestMapping(value="/loginpage",method=RequestMethod.POST)
	public ModelAndView loginPage()
	{
		return new ModelAndView("LoginPage");
	}
	
	@RequestMapping(value = "/loginvalidation", method = RequestMethod.POST)
	public ModelAndView loginValidation(@RequestParam("email") String mail, @RequestParam("password") String password) 
	{
		 Object n = studentServiceInterface.loginValidation(mail, password);

		if (n!=null) 
		{
			return new ModelAndView("HomePage");
		}

		else 
		{
			String msg = " The email and password is not matching. please enter  again";
			return new ModelAndView("LoginPage", "msg", msg);
		}

	}
	
	
}