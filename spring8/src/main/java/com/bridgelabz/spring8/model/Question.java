package com.bridgelabz.spring8.model;


	import java.util.Iterator;
	import java.util.List;

	public class Question
	{

		private int id;
		private String name;
		private List<String> answers;
		
		public Question(int id,String name,List<String> answers)
		{
			this.id=id;
			this.name=name;
			this.answers=answers;
		}
		
		public void display()
		{
			System.out.println("id is "+id);
			
			Iterator<String> it=answers.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		
	}

