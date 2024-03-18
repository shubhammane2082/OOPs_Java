package com.java.oops.Bankaccount;

public class BankAccount implements Account
{
	private double Balance;
	private String accountNumber;
	@Override
	public void deposite(double Amount) 
	{
		if(Amount > 0)
		{
			Balance += Amount;
			System.out.println("Deposited Amount is : "+Amount);
			System.out.println("Current Account Balance is : "+Balance);
		}
		else {
			System.out.println("Invalid Amount...");
		}
	}
	@Override
	public void withdrawmoney(double Amount) 
	{
		if(Amount > 0 && Balance >= Amount)
		{
			Balance -= Amount;
			System.out.println("Withdraw Amount is : "+Amount);
			System.out.println("Current Account Balance is : "+Balance);
		}
		else {
			System.out.println("Insufficient Account Balance...");
		}
	}
}
