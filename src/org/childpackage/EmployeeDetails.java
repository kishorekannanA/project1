package org.childpackage;

import org.parrentpackages.Employee;

public class EmployeeDetails {

	public void empAge() {
		System.out.println("Employee Age : 26");
	}
	public static void main(String[] args) {
		
		EmployeeDetails empD = new EmployeeDetails();
		Employee empI = new Employee();
		empD.empAge();
		empI.empId();
		empI.empName();
		}

}
