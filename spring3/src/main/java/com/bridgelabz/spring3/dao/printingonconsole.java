package com.bridgelabz.spring3.dao;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.spring3.model.Student;

public class printingonconsole {
	
    	public static void main(String[] args)
    	{
		
	  Resource resource=new ClassPathResource("applictionconfiguration.xml");	
	  BeanFactory factory=new XmlBeanFactory(resource)	;
	  
	  Student student=(Student)factory.getBean("studentbean");  
	  student.dispalyInfo();
	  
    	}

}
