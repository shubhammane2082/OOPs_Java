package com.java.oops3.RectangleArea;

import java.util.Scanner;

public class RectangleAreaMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		double length=sc.nextDouble();
		System.out.println("Enter the breadth of rectangle : ");
		double breadth=sc.nextDouble();
		
		AreaRectangle(length,breadth);
	}
	
	public static void AreaRectangle(double length,double breadth)
	{
		double area=length * breadth;
		System.out.println("Area of Rectangle is : "+area);
	}
}
