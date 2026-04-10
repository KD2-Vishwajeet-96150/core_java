package com.sunbeam;
import java.util.Scanner;

class Employee{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	Employee(){
		
	}

	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary  < 0) {
			return;
		}
		this.monthlySalary = monthlySalary;
	}
	
	public double yearlySalary() {
		double yearSalary =0;
		yearSalary = yearSalary + monthlySalary * 12;
		return yearSalary;
	}
	
	public double raise() {
		monthlySalary = monthlySalary + monthlySalary * 0.1;
		return monthlySalary;
	}
	
}


class EmployeeTest{
	Scanner sc = new Scanner(System.in);
//	Employee emp = new Employee();
	public void acceptEmp(Employee emp) {
		System.out.println("Enter first name:");
		String firstName = sc.next();
		emp.setFirstName(firstName);
		
		System.out.println("Enter last name:");
		String lastName = sc.next();
		emp.setLastName(lastName);
		
		System.out.println("Enter monthly salary:");
		double monthlySalary = sc.nextDouble();
		emp.setMonthlySalary(monthlySalary);
		
	}
	
	public void printEmp(Employee emp){
		System.out.println("First Name:"+emp.getFirstName());
		System.out.println("First Name:"+emp.getLastName());
		System.out.println("First Name:"+emp.getMonthlySalary());
		double salary = emp.yearlySalary();
		System.out.println("Yearly Salary :"+salary);
		emp.raise();
		salary = emp.yearlySalary();
		System.out.println("With Incremented Yearly Salary :"+salary);
		
		
	}
}

public class Q2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		EmployeeTest empT = new EmployeeTest();
		
		empT.acceptEmp(emp1);
		empT.printEmp(emp1);
		
		empT.acceptEmp(emp2);
		empT.printEmp(emp2);
		
		

	}

}
