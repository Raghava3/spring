package com.bridgelabz.studentregistration.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.studentregistration.dao.StudentDaoInterface;
import com.bridgelabz.studentregistration.model.Student;



public class StudentServiceImplementation implements StudentServiceInterface
{
	@Autowired
	StudentDaoInterface studentDaoInterface;
	
 
 
public int register(Student student) 
{
	 int n =studentDaoInterface.register(student);
		return n;
}


}
