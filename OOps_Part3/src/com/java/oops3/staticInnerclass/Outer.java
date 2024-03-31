package com.java.oops3.staticInnerclass;

public class Outer{
	
	static class Inner
	{
		 public void show()
		{
			System.out.println("show method call...");
		}
	}
	public static void main(String[] args) 
	{
		Outer.Inner innerObject1=new Outer.Inner();
		innerObject1.show();
		
		Outer.Inner innerObject2=new Outer.Inner();
		innerObject2.show();
	}
}
