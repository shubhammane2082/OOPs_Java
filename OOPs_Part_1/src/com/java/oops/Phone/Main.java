package com.java.oops.Phone;

public class Main {

	public static void main(String[] args) 
	{
		Phone ph=new Phone("Iphone", "12", 256.0);
		ph.phoneDetails();
		
		double phonecapacity=ph.calculatepriceofPhone();
		System.out.println("Price of Phone is : $"+phonecapacity);
		
	}

}
