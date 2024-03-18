package com.java.oops.Employee;

public class Main{

	public static void main(String[] args) 
	{
		Employee employee=new Employee(1, "Alex", 100.7);
		employee.printEmployeedetails();
		System.out.println();
		employee.employeeYearlySalary();
	}
}
