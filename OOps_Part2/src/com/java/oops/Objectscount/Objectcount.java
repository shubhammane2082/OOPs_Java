package com.java.oops.Objectscount;

public class Objectcount 
{
	private static int objectcounter=0;
	
	public Objectcount()
	{
		objectcounter++;
	}
	
	public static int getobjectcounter()
	{
		return objectcounter;
	}

}
