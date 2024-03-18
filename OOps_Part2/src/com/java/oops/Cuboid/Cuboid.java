package com.java.oops.Cuboid;

public class Cuboid 
{
	double length, breadth, height;
	
	public Cuboid(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public double volume()
	{
		double volume=length*breadth*height;
		double area=Area();
		System.out.println("Area of Cuboid is : "+area);
		return volume;
	}

	private double Area() 
	{
		double area=4*(length*breadth + breadth * height + height * length);
		double perimeter=perimeter();
		System.out.println("Perimeter of Cuboid is : "+perimeter);
		return area;
	}
	
	private double perimeter()
	{
		double perimeter=4 * (length+breadth+height);
		return perimeter;
	}
}
