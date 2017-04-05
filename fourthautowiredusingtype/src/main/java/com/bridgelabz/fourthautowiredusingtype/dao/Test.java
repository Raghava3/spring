package com.bridgelabz.fourthautowiredusingtype.dao;


	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.fourthautowiredusingtype.model.Employee;



	public class Test
	{
		
		public static void main(String[] args) 
		{
			
			ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationConfiguration.xml");
			Employee employee=(Employee)applicationContext.getBean("employee");
			employee.display();
			
		}

	}



