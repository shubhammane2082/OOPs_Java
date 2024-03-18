package com.java.oops.AccountwithdrawMoney;

public class AccountmMain {

	public static void main(String[] args) 
	{
		Account account=new Account(10000);
		
		System.out.println("Initial Balance is "+account.getBalance());
		account.Debit(500);
		account.Debit(5000);
		System.out.println("After the Withdrawl Remaining Balance is : "+account.getBalance());
		
	}

}
