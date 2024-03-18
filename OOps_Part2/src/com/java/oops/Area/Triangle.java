package com.java.oops.Area;

public class Triangle 
{
	double base;
	double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double Area_triangle()
	{
		double area;
		area=0.5*base*height;
		return area;
	}
}
