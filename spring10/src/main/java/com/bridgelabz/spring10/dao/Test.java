package com.bridgelabz.spring10.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring10.model.Question;

public class Test {

	public static void main(String[] args) {  
//	    Resource r=new ClassPathResource("applicationContext.xml");  
//	    BeanFactory factory=new XmlBeanFactory(r);  
	      
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
	    Question q=(Question)applicationContext.getBean("spring10");  
	    q.displayInfo();  
	      
	}  

	
}
