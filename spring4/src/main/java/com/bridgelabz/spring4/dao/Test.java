package com.bridgelabz.spring4.dao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring4.model.Employee;

public class Test
{
	public static void main(String[] args)
	{
       ApplicationContext context=new ClassPathXmlApplicationContext("applicatioonconfiguration");	
		Employee employee=(Employee)context.getBean("employeebean");
		employee.displayInfo();
		
	}
}
