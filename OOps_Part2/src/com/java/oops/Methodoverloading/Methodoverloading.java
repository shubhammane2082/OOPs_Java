package com.java.oops.Methodoverloading;

import java.util.Scanner;

public class Methodoverloading {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c : ");
		int c=sc.nextInt();
		System.out.println("Enter the value of d : ");
		int d=sc.nextInt();
		
		Add(a,b);
		Add(a,b,c);
		Add(a,b,c,d);
	}
	
	private static void Add(int a, int b, int c, int d) 
	{
		int result=a+b+c+d;
		System.out.println("Addition of Three Numbers is : "+result);
	}

	private static void Add(int a, int b, int c) 
	{
		int result=a+b+c;
		System.out.println("Addition of Three Numbers is : "+result);
	}

	private static void Add(int a,int b)
	{
		int result=a+b;
		System.out.println("Addition of Two Numbers is : "+result);
	}

}
