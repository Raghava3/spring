package com.bridgelabz.spring4.model;

public class Employee {

	private int empid;
	private String empname;
	private String team;
	public int getEmpid() {
		return empid;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;	
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void displayInfo()
	{

		System.out.println("employee name="+empname+" "+"team  "+team);

	}

}
