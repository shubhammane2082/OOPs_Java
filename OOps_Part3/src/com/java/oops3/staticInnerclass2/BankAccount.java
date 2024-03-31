package com.java.oops3.staticInnerclass2;

public class BankAccount 
{
	public static double balance;
	private static double InterestRate;
	
	
	public BankAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		InterestRate = interestRate;
	}
	
	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return InterestRate;
	}
	
	static class Interest{
		public double calculateInterest()
		{
			return balance*InterestRate;
		}
	}
	public static void main(String[] args) 
	{
		BankAccount bankAccount=new BankAccount(1000, 10.5);
		BankAccount.Interest interest=new BankAccount.Interest();
		
		System.out.println("Balance is : "+bankAccount.getBalance());
		System.out.println("Interest Rate is : "+bankAccount.getInterestRate());
		System.out.println("Calculate Interest is : "+interest.calculateInterest());
	}

}
