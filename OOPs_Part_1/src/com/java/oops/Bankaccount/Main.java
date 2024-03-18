package com.java.oops.Bankaccount;

public class Main {

	public static void main(String[] args) 
	{
		BankAccount bankacc=new BankAccount();
		bankacc.deposite(800);
		bankacc.withdrawmoney(250);
		bankacc.withdrawmoney(100);
		bankacc.deposite(500);
	}

}
