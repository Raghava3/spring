package com.bridgelabz.studentregistration.service;

<<<<<<< HEAD

import com.bridgelabz.studentregistration.Model.Student;

public interface StudentServiceInterface {

	//to save data  into mysql database
	public int register (Student student);
 	
	public Object loginValidation(String mail, String password);

=======
import com.bridgelabz.studentregistration.model.Student;

public interface StudentServiceInterface {

	public int register(Student student);
	
>>>>>>> 9e1930400eecd909387259bb7e00b50a936c660f
}
