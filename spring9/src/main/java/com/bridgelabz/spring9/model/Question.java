package com.bridgelabz.spring9.model;

import java.util.Iterator;
import java.util.List;

public class Question 
{
    private int id;
	private String name;
	//if we use the set we can't add duplicates
	//if we use the list then we can add the duplicates
	private List<Answers> answers;
	
	public Question(int id,String name,List<Answers> answers)
	{
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void display()
	{
		System.out.println("id is "+id);
		System.out.println("question is"+name);
		Iterator<Answers> it=answers.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
}
