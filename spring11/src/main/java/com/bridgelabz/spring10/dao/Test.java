package com.bridgelabz.spring10.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring10.model.Question;

public class Test {
	
	public static void main(String[] args) { 
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
//	    Resource r=new ClassPathResource("applicationContext.xml");  
//	    BeanFactory factory=new XmlBeanFactory(r);  
//	      
	    Question question=(Question)applicationContext.getBean("q");  
	   question.displayInfo();
	      
	}  
	

}
