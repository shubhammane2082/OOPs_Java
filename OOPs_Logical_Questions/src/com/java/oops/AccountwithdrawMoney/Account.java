package com.java.oops.AccountwithdrawMoney;

public class Account 
{
	double Balance;

	public Account(double balance) 
	{
		this.Balance = balance;
	}
	
	public double getBalance()
	{
		return Balance;
	}
	
	public void Debit(double Amount)
	{
		if(Amount > Balance)
		{
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			Balance = Balance - Amount;
			System.out.println("Debit Amount "+Amount+" Sucessful.");
		}
	}

}
