package com.java.oops.Area;

import java.util.Scanner;

public class Rectangle 
{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea()
	{
		double area;
		area=length * breadth;
		return area;
	}
}
