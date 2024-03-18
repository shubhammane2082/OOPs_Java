package com.java.oops.Tv;

public class TV 
{
	String Brand;
	double size;
	double Price;
	
	public TV(String Brand,double size,double Price)
	{
		this.Brand=Brand;
		this.size=size;
		this.Price=Price;
		
	}
	
	public void TVdetails()
	{
		System.out.println("Tv Brand is : "+Brand);
		System.out.println("Tv Size is : "+size);
		System.out.println("Original Price of Tv is : "+Price);
	}
	
	public void discount()
	{
		double discountPrice;
		if(size <= 20 && size >= 15)
		{
			discountPrice = Price * 15 /100;
			Price = Price - discountPrice;
			System.out.println("Price of Tv after the Discount : "+Price);
		}
		else if(size<15)
		{
			discountPrice = Price * 25 /100;
			Price = Price - discountPrice;
			System.out.println("Price of Tv after the Discount : "+Price);
		}
		else 
		{
			discountPrice = Price * 30 /100;
			Price = Price - discountPrice;
			System.out.println("Price of Tv after the Discount : "+Price);
		}
	}
}
