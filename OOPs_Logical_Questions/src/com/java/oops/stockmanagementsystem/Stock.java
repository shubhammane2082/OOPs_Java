package com.java.oops.stockmanagementsystem;

public class Stock 
{
	String stock_Name;
	int No_of_stock;
	double stock_Price;
	
	
	public Stock(String stock_Name, int no_of_stock, double stock_Price) {
		super();
		this.stock_Name = stock_Name;
		No_of_stock = no_of_stock;
		this.stock_Price = stock_Price;
	}
	
	public double getstockValue()
	{
		return No_of_stock * stock_Price ;
	}
	
	public String getstock_Name()
	{
		return stock_Name;
	}
	
	public int getNo_of_stock()
	{
		return No_of_stock;
	}
	
	public double getstock_Price()
	{
		return stock_Price;
	}
	
	
	
}
