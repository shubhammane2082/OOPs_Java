package com.java.oops.Area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of length and Breadth is : ");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		
		System.out.println("Enter the value of Base and Height is : ");
		double Base=sc.nextDouble();
		double height=sc.nextDouble();
		
		Rectangle rectangle=new Rectangle(length, breadth);
		Triangle triangle=new Triangle(Base, height);
		
		double rectangleArea=calculateareaofRectangle(rectangle);
		double triangleArea=calculateareaofTriangle(triangle);
		
		System.out.println("Area of Rectangle is : "+rectangleArea);
		System.out.println("Area of Triangle is : "+triangleArea);
	}	
	public static double calculateareaofRectangle(Rectangle rectangle)
	{
		return rectangle.calculateArea();
	}
	public static double calculateareaofTriangle(Triangle triangle)
	{
		return triangle.Area_triangle();
	}
}
