package com.bridgelabz.spring7.model;

public class Student {
	
	private int regno;
	private String name;
	private MarksCard marksCard;
	
	public Student(int regno,String name,MarksCard marksCard)
	{
		this.regno=regno;
		this.name=name;
		this.marksCard=marksCard;
	}

	public void diaplay()
	{
		System.out.println("regno: "+regno+"name:"+name);
	    System.out.println(marksCard.toString());  
	    }
	
}
