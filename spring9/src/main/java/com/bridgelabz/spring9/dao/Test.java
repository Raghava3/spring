package com.bridgelabz.spring9.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.spring9.model.Question;

public class Test {
	
	public static void main(String[] args)
	{
		  Resource r=new ClassPathResource("applicationconfiguration.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Question q=(Question)factory.getBean("question");  
		    q.display();
		
	}

}
