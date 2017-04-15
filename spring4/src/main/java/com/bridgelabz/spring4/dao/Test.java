package com.bridgelabz.spring4.dao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring4.model.Employee;

public class Test
{
	public static void main(String[] args)
	{
		// if you are using the application context no need to create Beanfactory beacuse while  intializing it self it will create bean facatory
        ApplicationContext context=new ClassPathXmlApplicationContext("applicatioonconfiguration.xml");	
		Employee employee=(Employee)context.getBean("employeebean");
		employee.displayInfo();
		//closing the resource leak by downcasting the context object to ConConfigurableApplicationContext
		((ConfigurableApplicationContext)context).close();
	}
}
