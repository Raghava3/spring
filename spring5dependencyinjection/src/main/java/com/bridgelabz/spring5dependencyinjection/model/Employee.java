package com.bridgelabz.spring5dependencyinjection.model;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee()
	{
		System.out.println("default constructor");
	}
	
	public Employee(int id)
	{
		this.id=id;
	System.out.println("this is integer constructor");	
	}

	
	public Employee(String name)
	{
		this.name=name;
		System.out.println("this is String constructor");	
		
	}
	
	public Employee(String name , int id)
	{
		this.name=name;
		this.id=id;
		System.out.println("this is the combination ");
	}
	
	
	public void display()
	{
		System.out.println("name is "+name+"id is "+id);
	}
}
