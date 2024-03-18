package com.java.oops.Shirt;

public class Shirt 
{
	int shirt_size;
	String shirt_color;
	double shirt_price;
	
	
	public Shirt(int shirt_size, String shirt_color, double shirt_price) {
		super();
		this.shirt_size = shirt_size;
		this.shirt_color = shirt_color;
		this.shirt_price = shirt_price;
	}
	
	public void displayShirtDetails()
	{
		System.out.println("Shirt Size is : "+shirt_size);
		System.out.println("Shirt Color is : "+shirt_color);
		System.out.println("Shirt Price is : "+shirt_price);
	}
	
	public double calculateshirtPrice()
	{
		double discountPrice;
		if(shirt_size > 40)
		{
			discountPrice = shirt_price * 20 /100;
			shirt_price = shirt_price - discountPrice;
		}
		else if(shirt_size < 30 && shirt_size > 20)
		{
			discountPrice = shirt_price * 13 /100;
			shirt_price = shirt_price - discountPrice;
		}
		else {
			discountPrice = shirt_price * 7 /100;
			shirt_price = shirt_price - discountPrice;
		}
		System.out.println("Discount Price of shirt is : "+discountPrice);
		return shirt_price;
	}
	
}
