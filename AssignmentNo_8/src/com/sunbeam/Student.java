package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private double marks;
	public Student() {
		
	}
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
//	public void acceptStudent(int roll) {
//		this.roll=roll;
//		System.out.println("Enter a Name : ");
//		name=new Scanner(System.in).nextLine();
//		System.out.println("Enter a Marks : ");
//		marks=new Scanner(System.in).nextDouble();
//	}
	
	@Override
	public String toString() {
		return "Student [roll=" + this.roll + ", name=" + this.name + ", marks=" + marks + "]"+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
			return false;
		Student std=(Student)obj;
		return this.roll==std.roll;
	}
	
}
