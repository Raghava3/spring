package com.bridgelabz.fourthautowiredusingtype.model;


public class Employee {
	
	private int empid;
	private String empname;
                                                                     
	public int getEmpid() {
		return empid;            
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


	private Address address1;
	private Address address2;
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
  public Address getAddress2() {
	return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}


	public void display()
	{  
		System.out.println("emp id is "+empid+"emp name is"+empname);
		System.out.println("address is "+getAddress1().getDoorno()+""+getAddress1().getCity()+" "+getAddress1().getState()+" "+getAddress1().getCountry());
	//    System.out.println("permanent address is "+getAddress2().getDoorno()+""+getAddress2().getCity()+" "+getAddress2().getState()+" "+getAddress2().getCountry());

	}

}
