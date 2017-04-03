package com.bridgelabz.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.model.Employee;

public class Test {

	 public static void main(String[] args) {
		
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationconfigurtaion.xml");
			Employee employee=(Employee)applicationContext.getBean("employee");
			employee.display();
			//closing the resource leak by downcasting the context object to ConConfigurableApplicationContext
			((ConfigurableApplicationContext)applicationContext).close();
		}
	}
	

