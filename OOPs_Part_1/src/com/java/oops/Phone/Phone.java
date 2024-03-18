package com.java.oops.Phone;

import java.util.HashMap;

public class Phone
{
	private String make;
	private String Model;
	private double storage;
	
	public Phone(String make,String Model,double storage)
	{
		this.make=make;
		this.Model=Model;
		this.storage=storage;
	}
	
	public void phoneDetails()
	{
		System.out.println("Phone make is : "+make);
		System.out.println("Phone Model is : "+Model);
		System.out.println("Phone Storage is : "+storage+" Gb");
	}
	
	public double calculatepriceofPhone()
	{
	HashMap<String, Double> phoneInformation=new HashMap<>();
	
	phoneInformation.put("RedmiRedmi 5A",  64.0);
	phoneInformation.put("Iphone 12",  256.0);
	phoneInformation.put("SamsungGalaxy20",  32.0);
	phoneInformation.put("OppoNordPlus+",  64.0);
	
	double baseprice=phoneInformation.getOrDefault(make+Model, 200.0);
	double storageprice=baseprice * 0.1;
	return baseprice + storageprice ;
	
	
	}
}
