package com.java.oops.Circle;

public class Circle 
{
	final double pi=3.14;
	
	public void areaofCircle(double radius)
	{
		double area;
		area=pi*radius*radius;
		System.out.println("Area of Circle is : "+area);
	}
	
	public void circumference(double radius)
	{
		double circumference;
		circumference=2*pi*radius;
		System.out.println("Circumference of Circle is : "+circumference);
	}
}
