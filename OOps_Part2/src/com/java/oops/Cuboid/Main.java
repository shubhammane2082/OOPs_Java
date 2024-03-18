package com.java.oops.Cuboid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of Cuboid : ");
		double length=sc.nextDouble();
		System.out.println("Enter the Breadth of Cuboid : ");
		double breadth=sc.nextDouble();
		System.out.println("Enter the Height of Cuboid : ");
		double height=sc.nextDouble();
		
		Cuboid cuboid=new Cuboid(length,breadth,height);
		double volume=cuboid.volume();
		System.out.println("Volume of Cuboid is : "+volume);
	}

}
