package com.bridgelabz.spring8.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring8.model.Question;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationconfiguration.xml");
		Question question=(Question)applicationContext.getBean("question");
		question.display();
		
		((ConfigurableApplicationContext)applicationContext).close();
	}
	
}
