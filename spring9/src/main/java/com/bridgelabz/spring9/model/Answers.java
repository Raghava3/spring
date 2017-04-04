package com.bridgelabz.spring9.model;

public class Answers {
	
	private int id;  
	private String name;  
	private String by;  
	  
	
	public Answers(int id, String name, String by) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.by = by;  
	}  
	  
	public String toString(){  
	    return id+" "+name+" "+by;  
	}  

}
