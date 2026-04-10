package com.sunbeam;

import java.util.Scanner;

class Employee  {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void acceptRecord() {
		System.out.println("Enter a ID : ");
		 id=new Scanner(System.in).nextInt();
		System.out.println("Enter a Name : ");
		 name=new Scanner(System.in).nextLine();
		System.out.println("Enter a Salary : ");
		 salary=new Scanner(System.in).nextDouble();
	}
	
}
