package com.java.oops.Circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		double radius=sc.nextDouble();
		
		Circle c=new Circle();
		c.areaofCircle(radius);
		c.circumference(radius);
	}

}
