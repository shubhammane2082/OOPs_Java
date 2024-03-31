package com.java.oops3.fabstractClass;

import java.util.Scanner;

public class MathOperationMain extends MathOperation {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		MathOperationMain main=new MathOperationMain();
		System.out.println("\nAddition is : "+main.add(a, b));
		System.out.println("Substraction is : "+main.substraction(a, b));
		System.out.println("Multiplication is : "+main.multiplication(a, b));
		System.out.println("Division is : "+main.division(a, b));
	}

	@Override
	int add(int a, int b) {return a+b;}

	@Override
	int substraction(int a, int b) {return a-b;}

	@Override
	int multiplication(int a, int b) {return a*b;}

	@Override
	int division(int a, int b) {return a/b;}

}
