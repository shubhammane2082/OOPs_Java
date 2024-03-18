package com.java.oops.comericalprocessing;

import java.time.LocalDateTime;

public class StockAccountMain {

	public static void main(String[] args) 
	{
		StockAccount stockAccount=new StockAccount();
		
		stockAccount.buy("Apple", 20, LocalDateTime.now());
		stockAccount.sell("Apple", 5, LocalDateTime.now());
		stockAccount.buy("Reliance", 20, LocalDateTime.now());
		stockAccount.buy("Adani", 30, LocalDateTime.now());
		
		for(Companyshare companyshare : stockAccount.getCompanyshare())
		{
			System.out.println(companyshare);
		}
	}

}
