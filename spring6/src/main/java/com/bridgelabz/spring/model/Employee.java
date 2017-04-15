package com.bridgelabz.spring.model;

public class Employee {
	
	private  int empid;
	private String name;
	private Address address;
	
	public Employee(int empid, String name, Address address)
	{
		this.empid=empid;
		this.name=name;
		this.address=address;
	}
	
	public void display()
	{
	    System.out.println("empid:"+" "+empid+" "+"name:"+" "+name );  
	    System.out.println(address.toString());  
	}
	

}
