package com.bridgelabz.secondautowired.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.secondautowired.model.Triangle;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationCofiguration.xml");
		Triangle triangle=(Triangle)applicationContext.getBean("triangle");
		triangle.dispaly();
		
		
	}

}
