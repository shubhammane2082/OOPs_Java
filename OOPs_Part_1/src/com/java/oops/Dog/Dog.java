package com.java.oops.Dog;

public class Dog 
{
	private String Breed;
	private int age;
	private double Weight;
	
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	
	public void printDoginformation()
	{
		System.out.println("Dog Breed is : "+Breed);
		System.out.println("Dog age is : "+age);
		System.out.println("Dog Weight is : "+Weight);
	}
	
	public int calculatedogageinhumanyears()
	{
		int humanage;
		
		if(age <= 2)
		{
			humanage=(age * 11);
		}
		else {
			humanage = 22 + ((age - 22) * 5);
		}
		return humanage;
	}
	
	
}
