package com.bridgelabz.spring5dependencyinjection.dao;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring5dependencyinjection.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationconfiguration.xml");
		Employee employee=(Employee)applicationContext.getBean("a");
		employee.display();
		//closing the resource leak by downcasting the context object to ConConfigurableApplicationContext
		((ConfigurableApplicationContext)applicationContext).close();
	}
		
	}


