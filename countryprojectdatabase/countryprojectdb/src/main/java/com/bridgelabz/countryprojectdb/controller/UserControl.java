package com.bridgelabz.countryprojectdb.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.countryprojectdb.model.User;
import com.bridgelabz.countryprojectdb.service.UserServiceInterface;

@Controller
@RequestMapping("/")
public class UserControl {
	@Autowired
	UserServiceInterface userServiceInterface;

	@RequestMapping(value = "registrationpage", method = RequestMethod.POST)
	public ModelAndView registrationPage() {
		return new ModelAndView("RegistrationPage");
	}

	@RequestMapping(value = "loginpage", method = RequestMethod.POST)
	public ModelAndView loginPage() {
		return new ModelAndView("LoginPage");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(User user) {
		int n = userServiceInterface.register(user);

		if (n == 1) {

			return new ModelAndView("LoginPage");

		} else {
			String msg = "registration failed please update again";
			return new ModelAndView("RegistrationPage", "msg", msg);

		}

	}

	@RequestMapping(value = "/loginvalidation", method = RequestMethod.POST)
	public ModelAndView loginValidation(@RequestParam("email") String email,
			@RequestParam("password") String password, HttpServletRequest req, HttpServletResponse resp) 
	{
		
	HttpSession session=req.getSession();
				
		
		try {

			Object l = userServiceInterface.loginValidation(email, password);
			
			//User u = (User) l;
			
			System.out.println("l="+l);
			
			if (l != null) {
				
			//	User u=(User)l;
				
				//session.invalidate();
				
				session.setAttribute("Email", email);
				
				ModelAndView mo=new ModelAndView("HomePage","id",l);
			//	mo.addObject("id", u.getId());	
				
                return mo;
			   
			}
			else {
				String msg = " The email and password is not matching. please enter  again";
				return new ModelAndView("LoginPage", "msg", msg);

			}

		} catch (Exception e) {
			String msg = "please signup ";
			return new ModelAndView("LoginPage", "msg", msg);

		}
	}
	
	@RequestMapping(value="/profile")
	public ModelAndView profile(@RequestParam("id") int id)
	{
	
		User l = userServiceInterface.profile(id);
		
        return  new 	ModelAndView("ProfilePage","ProfileDetails",l);
		
	}
	@RequestMapping(value="/home")
	public ModelAndView profile()
	{
		return  new ModelAndView("HomePage");
		
	}
	
	
	
	@RequestMapping(value="/filter/logout")
	public String logout(HttpServletRequest req, HttpServletResponse resp)
	{
	
		int l = userServiceInterface.logout(req, resp);
		
        if(l==1)
        {
        	return "redirect:/LoginPage";
        }
        else
        {
        	return "redirect:/LoginPage";
        }
		
	}
	

}
