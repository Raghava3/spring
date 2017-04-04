package com.bridgelabz.thirdautowired.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.thirdautowired.model.Employee;

public class Test
{
	
	public static void main(String[] args) 
	{
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationConfiguartion.xml");
		Employee employee=(Employee)applicationContext.getBean("employee");
		employee.display();
		
	}

}
