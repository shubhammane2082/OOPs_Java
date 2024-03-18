package com.java.oops.Calculateareabymethodoverloading;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of side : ");
		int side=sc.nextInt();
		
		System.out.println("Enter the Length : ");
		double length=sc.nextDouble();
		System.out.println("Enter the Breadth : ");
		double breadth=sc.nextDouble();
		
		System.out.println("Enter the Radius : ");
		double radius=sc.nextDouble();
		
		Square square=new Square();
		square.Area(side);
		
		Rectangle rectangle=new Rectangle();
		rectangle.Area(length, breadth);
		
		Circle circle=new Circle();
		circle.Area(radius);
		
	}

}
