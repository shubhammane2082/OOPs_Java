package com.java.oops.Shirt;

public class Main {

	public static void main(String[] args) 
	{
		Shirt shirt=new Shirt(10, "Green", 150);
		shirt.displayShirtDetails();
		double price=shirt.calculateshirtPrice();
		System.out.println();
		System.out.println("Shirt Price is : "+price);
	}

}
