package com.java.oops.Furniture;

public class Main {
	public static void main(String[] args) 
	{
		Furniture furniture=new Furniture();
		furniture.setFurniture_type("Traditional");
		furniture.setFurniture_materail("Glass");
		furniture.setFurniture_price(30000);
		
		furniture.furnitureDetails();
		System.out.println();
		furniture.funrniturePrice();
	}

}
