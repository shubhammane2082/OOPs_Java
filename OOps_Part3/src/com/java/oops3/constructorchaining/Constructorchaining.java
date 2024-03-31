package com.java.oops3.constructorchaining;

public class Constructorchaining
{
	public Constructorchaining()
	{
		this(20);
		System.out.println("Default constructor...");
	}
	
	public Constructorchaining(int x)
	{
//		this(10,20);
		System.out.println("Value of x in Parameterized constructor is : "+x);
	}
	
	public Constructorchaining(int x,int y)
	{
		this();
		System.out.println("value of x :"+x+".value of y : "+y+". sum is : "+(x+y));
	}
	
	public static void main(String[] args) {
		Constructorchaining constructorchaining=new Constructorchaining(10, 20);
	}
}
