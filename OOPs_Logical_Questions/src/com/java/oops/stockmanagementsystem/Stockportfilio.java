package com.java.oops.stockmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Stockportfilio 
{
	List<Stock> stockList=new ArrayList<>();
	
	public void addStock(Stock stock)
	{
		stockList.add(stock);
	}
	
	public double calculatetotalValue()
	{
		double totalValue=0;
		for(Stock stock : stockList)
		{
			totalValue =totalValue + stock.getstockValue();
		}
		return totalValue;
	}
	
	public void printStockinformation()
	{
		for(Stock stock : stockList)
		{
			System.out.println("Stock name is : "+stock.getstock_Name());
			System.out.println("No. of stock is : "+stock.getNo_of_stock());
			System.out.println("Stock Price is : "+stock.getstock_Price());
			System.out.println("Total stock value is : "+stock.getstockValue());
		}
		
		System.out.println("Total Stock portfolio is : "+calculatetotalValue());
	}
}
