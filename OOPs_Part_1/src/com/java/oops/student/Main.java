package com.java.oops.student;

public class Main {

	public static void main(String[] args) 
	{
		Student student=new Student();
		student.setstudent_Id(1);
		student.setstudent_Name("David");
		student.setstudent_Age(20);
		
		System.out.println("Name of Student is : "+student.getstudent_Name()+" and Age of Student is : "+student.getstudent_Age());
	}

}
