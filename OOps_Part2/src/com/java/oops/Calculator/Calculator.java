package com.java.oops.Calculator;

import java.util.Scanner;

public class Calculator 
{
	Scanner sc=new Scanner(System.in);
	
	public void named_Input()
	{
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		int result=add(a,b);
		System.out.println("Addition of Two Numbers is : "+result);
	}
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
}
