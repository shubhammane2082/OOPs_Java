package com.java.oops.stockmanagementsystem;

import java.util.Scanner;

public class StockMannagementMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Stockportfilio stockportfilio=new Stockportfilio();
		
		System.out.println("Enter the number of stocks : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter stock name: ");
            String stock_Name = sc.next();

            System.out.print("Enter number of shares: ");
            int No_of_stock = sc.nextInt();

            System.out.print("Enter share price: ");
            double stock_Price = sc.nextDouble();
            
            Stock stock=new Stock(stock_Name, No_of_stock, stock_Price);
            stockportfilio.addStock(stock);
		}
		stockportfilio.printStockinformation();
		
	}

}
