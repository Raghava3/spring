package com.bridgeit;

public class Student 
{
	
	private String name;  
	private int age;  
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() 
	{  
	    return name;  
	}  
	  
	public void setName(String name)
	{  
	    this.name = name;  
	}  
	  
	public void displayInfo()
	{  
	    System.out.println("Hello: "+name+"age is "+age);
	    	
	}  

}
