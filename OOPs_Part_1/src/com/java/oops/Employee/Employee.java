package com.java.oops.Employee;

public class Employee
{
	 private int employee_Id;
	 private String employee_Name;
	 private double employee_salary;

	public Employee(int employee_Id,String employee_Name,double employee_salary)
	{
		this.employee_Id=employee_Id;
		this.employee_Name=employee_Name;
		this.employee_salary=employee_salary;
	}
	
	public void employeeYearlySalary()
	{
		double yearly_Salary=0;
		yearly_Salary = employee_salary * 12;
		System.out.println("Employee Yearly Salary is : $"+yearly_Salary);
	}
	
	public void printEmployeedetails()
	{
		System.out.println("Employee Id is : "+employee_Id);
		System.out.println("Employee Name is : "+employee_Name);
		System.out.println("Employee Salary is : $"+employee_salary);
	}
	 

}
