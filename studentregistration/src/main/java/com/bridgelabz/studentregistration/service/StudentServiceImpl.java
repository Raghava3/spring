package com.bridgelabz.studentregistration.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.studentregistration.Model.Student;
import com.bridgelabz.studentregistration.dao.StudentDaoInterface;

public class StudentServiceImpl implements StudentServiceInterface
{
	@Autowired
	private StudentDaoInterface studentDaoInterface;


	public int register(Student student) {
   int n=studentDaoInterface.register(student);
		return n;
	}



	public Object loginValidation(String mail, String password) {
		Object n=studentDaoInterface.loginValidation(mail, password);
		return n;
	}
	
	

}
