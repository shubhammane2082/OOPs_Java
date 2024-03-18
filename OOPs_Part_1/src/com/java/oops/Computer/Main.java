package com.java.oops.Computer;

public class Main {

	public static void main(String[] args) 
	{
		Computer comp=new Computer("I5", 32, 256);
		comp.computerDetails();
		System.out.println();
		double result=comp.calculatecomputerPrice();
		System.out.println("Price of Computer is : $"+result);
	}

}
