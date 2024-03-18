package com.java.oops.comericalprocessing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StockAccount 
{
	List<Companyshare> stockAccountlist;
	
	public StockAccount()
	{
		stockAccountlist=new ArrayList<>();
	}
	
	public void buy(String stock_symbol, int No_of_stcok, LocalDateTime date_Time)
	{
		updatestockaccount(stock_symbol,No_of_stcok,date_Time);
		System.out.println("No. of share buy is : "+No_of_stcok +" and Stock Symbol is : "+stock_symbol);
	}
	
	public void sell(String stock_symbol, int No_of_stcok, LocalDateTime date_Time)
	{
		updatestockaccount(stock_symbol,-No_of_stcok,date_Time);
		System.out.println("No. of share sell is : "+No_of_stcok +" and Stock Symbol is : "+stock_symbol);
	}

	private void updatestockaccount(String stock_symbol, int no_of_stcok, LocalDateTime date_Time) {
		boolean Ispresent=false;
		
		for(Companyshare companyshare : stockAccountlist)
		{
			if(companyshare.getStock_symbol().equals(stock_symbol))
			{
				companyshare.setNo_of_stcok(companyshare.getNo_of_stcok()+ no_of_stcok);
				Ispresent=true;
				break;
			}
		}
		
		if(!Ispresent)
		{
			stockAccountlist.add(new Companyshare(stock_symbol, no_of_stcok, date_Time));
		}
		
	}
	
	public List<Companyshare> getCompanyshare()
	{
		return stockAccountlist;
	}
	
	

}
