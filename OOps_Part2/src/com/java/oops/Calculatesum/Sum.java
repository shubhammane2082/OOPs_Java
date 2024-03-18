package com.java.oops.Calculatesum;

public class Sum 
{
	byte a;
	byte b;
	
	public Sum(byte a, byte b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int Add(byte a, byte b) 
	{
	  int c=(int) a;
	  int d=(int) b;
	  
	  int sum=c+d;
	  return sum;
	}

}
