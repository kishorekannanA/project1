package org.parrentpackages;

public class Employee {
	public void empName() {
		System.out.print("Employee Name : kishore");
		System.out.print("  Kannan");
	}
	public void empId() {
		System.out.println("Employee ID : 007");
	}
	public static void main(String[] args)
	{
		Employee empInfo = new Employee();
		empInfo.empId();
		empInfo.empName();
		
				
	}
	
}
