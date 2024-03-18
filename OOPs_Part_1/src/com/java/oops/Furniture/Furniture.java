package com.java.oops.Furniture;

public class Furniture 
{
	private String furniture_type;
	private String furniture_materail;
	private double furniture_price;
	
	public String getFurniture_type() {
		return furniture_type;
	}
	public void setFurniture_type(String furniture_type) {
		this.furniture_type = furniture_type;
	}
	public String getFurniture_materail() {
		return furniture_materail;
	}
	public void setFurniture_materail(String furniture_materail) {
		this.furniture_materail = furniture_materail;
	}
	public double getFurniture_price() {
		return furniture_price;
	}
	public void setFurniture_price(double furniture_price) {
		this.furniture_price = furniture_price;
	}
	
	public void furnitureDetails()
	{
		System.out.println("Furniture Types is : "+furniture_type);
		System.out.println("Furniture Material is : "+furniture_materail);
		System.out.println("Original Price of Furniture is : "+furniture_price);
	}
	
	public void funrniturePrice()
	{
		double furnitureDiscountprice;
		if(furniture_materail == "Wood")
		{
			furnitureDiscountprice = furniture_price * 8 / 100;
			furniture_price = furniture_price - furnitureDiscountprice;
			System.out.println("Discount Price is : "+furnitureDiscountprice);
			System.out.println("Price of Furniture after the Discount is : "+furniture_price);
		}
		
		else if(furniture_materail == "Glass")
		{
			furnitureDiscountprice = furniture_price * 15 / 100;
			furniture_price = furniture_price - furnitureDiscountprice;
			System.out.println("Discount Price is : "+furnitureDiscountprice);
			System.out.println("Price of Furniture after the Discount is : "+furniture_price);
		}
		else {
			furnitureDiscountprice = furniture_price * 25 / 100;
			furniture_price = furniture_price - furnitureDiscountprice;
			System.out.println("Discount Price is : "+furnitureDiscountprice);
			System.out.println("Price of Furniture after the Discount is : "+furniture_price);
		}
	}
	
	
}
