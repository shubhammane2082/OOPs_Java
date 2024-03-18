package com.java.oops.student;

public class Student
{
	private int student_Id;
	private String student_Name;
	private int student_Age;
	
	public void setstudent_Id(int student_Id)
	{
		this.student_Id=student_Id;
	}
	
	public void setstudent_Name(String student_Name)
	{
		this.student_Name=student_Name;
	}
	
	public void setstudent_Age(int student_Age)
	{
		this.student_Age=student_Age;
	}
	
	public int getstudent_Id()
	{
		return student_Id;
	}
	public String getstudent_Name()
	{
		return student_Name;
	}
	public int getstudent_Age()
	{
		return student_Age;
	}
}
