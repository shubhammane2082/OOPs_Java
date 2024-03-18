package com.java.oops.Dog;

public class Main {

	public static void main(String[] args) 
	{
		Dog dog=new Dog();
		dog.setBreed("Labra");
		dog.setAge(20);
		dog.setWeight(60.5);
		
		dog.printDoginformation();
		int age=dog.calculatedogageinhumanyears();
		System.out.println("Dog's Age in Human Years is : "+age);
	}

}
