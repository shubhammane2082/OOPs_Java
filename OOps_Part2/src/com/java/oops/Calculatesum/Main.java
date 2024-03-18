package com.java.oops.Calculatesum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		byte a=sc.nextByte();
		
		System.out.println("Enter the value of b : ");
		byte b=sc.nextByte();
		
		Sum sum=new Sum(a, b);
		int result=sum.Add(a, b);
		System.out.println("Sum of a & b is : "+result);
	}

}
