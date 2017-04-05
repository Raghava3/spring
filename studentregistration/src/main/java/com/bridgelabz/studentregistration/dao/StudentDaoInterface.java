package com.bridgelabz.studentregistration.dao;

import com.bridgelabz.studentregistration.Model.Student;

public interface StudentDaoInterface 
{

	public int register(Student student);

   public Object loginValidation(String mail, String password);
	
}
