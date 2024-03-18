package com.java.oops.comericalprocessing;

import java.time.LocalDateTime;

public class Companyshare 
{
	String stock_symbol;
	int No_of_stcok;
	LocalDateTime date_Time;
	
	public Companyshare(String stock_symbol, int no_of_stcok, LocalDateTime date_Time) 
	{
		this.stock_symbol = stock_symbol;
		No_of_stcok = no_of_stcok;
		this.date_Time = date_Time;
	}
	
	

	public String getStock_symbol() {
		return stock_symbol;
	}



	public void setStock_symbol(String stock_symbol) {
		this.stock_symbol = stock_symbol;
	}



	public int getNo_of_stcok() {
		return No_of_stcok;
	}



	public void setNo_of_stcok(int no_of_stcok) {
		No_of_stcok = no_of_stcok;
	}



	public LocalDateTime getDate_Time() {
		return date_Time;
	}



	public void setDate_Time(LocalDateTime date_Time) {
		this.date_Time = date_Time;
	}



	@Override
	public String toString() {
		return "Compnayshare [stock_symbol=" + stock_symbol + ", No_of_stcok=" + No_of_stcok + ", date_Time="
				+ date_Time + "]";
	}
	
}
