package com.bridgelabz.spring7.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring7.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationconfiguration.xml");
		Student student=(Student)applicationContext.getBean("student");
		
		student.diaplay();
		
		((ConfigurableApplicationContext)applicationContext).close();
	}
	
}
