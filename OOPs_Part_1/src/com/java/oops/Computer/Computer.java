package com.java.oops.Computer;

public class Computer 
{
	private String Processor;
	private int RAM;
	private int Storage;
	
	public Computer(String Processor,int RAM, int Storage)
	{
		this.Processor=Processor;
		this.RAM=RAM;
		this.Storage=Storage;
	}
	
	public double calculatecomputerPrice()
	{
		double basePrice=200;
		double processorPrice;
		double RAMprice;
		double storagePrice;
		if(Processor.equals("i7"))
		{
			processorPrice = 180;
		}
		else if(Processor.equals("i5"))
		{
			processorPrice = 150;
		}
		else {
			processorPrice = 80;
		}
		
		RAMprice = RAM * 10;
		
		storagePrice = Storage * 0.1;
		
		return processorPrice + RAMprice + storagePrice+basePrice;
	}
	
	public void computerDetails()
	{
		System.out.println("Computer Processor is : "+Processor);
		System.out.println("Computer RAM is : "+RAM+" Gb");
		System.out.println("Computer Storage is : "+Storage+" Gb");
	}
}
