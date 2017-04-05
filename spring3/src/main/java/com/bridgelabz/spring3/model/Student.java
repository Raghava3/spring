package com.bridgelabz.spring3.model;

public class Student {

	private int id;
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void dispalyInfo()
	{
		System.out.println("student name  email");
	 System.out.println(firstname+middlename+lastname+" "+email);
	}
	
}
