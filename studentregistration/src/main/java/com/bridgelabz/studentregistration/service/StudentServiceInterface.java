package com.bridgelabz.studentregistration.service;


import com.bridgelabz.studentregistration.Model.Student;

public interface StudentServiceInterface {

	//to save data  into mysql database
	public int register (Student student);
 	
	public Object loginValidation(String mail, String password);

}
