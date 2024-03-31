package com.java.oops3.Method;

import java.util.Scanner;

public class Main {
	static double length,breadth,height;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Main main=new Main();
		double result=main.volumeCuboid();
		System.out.println("Volume of Cuboid is : "+result);
	}
	
	public double volumeCuboid()
	{
		System.out.println("Enter the length of cuboid : ");
		double length=sc.nextDouble();
		System.out.println("Enter the breadth of cuboid : ");
		double breadth=sc.nextDouble();
		System.out.println("Enter the height of cuboid : ");
		double height=sc.nextDouble();
		
		return length * breadth *height;
	}
	
}
