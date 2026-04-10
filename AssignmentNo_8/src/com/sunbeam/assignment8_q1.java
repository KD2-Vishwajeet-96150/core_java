package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Q1. Create a menu driven code that have below menus 
1. add the student in the collection - accept the details from user and add in the collection 2. Display all the 
students using iterator. 
3. search the student on rollno and if found display his details. 
4. sort the students on rollno 
5. sort the students on name 
6. sort the students on marks 
(Hint - use List Interface and Object of ArrayList)
 * 
 * 
 * 
 */

class SortStudentOnRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRoll()-o2.getRoll();
	}
	
}
class SortStudentOnMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getMarks()-o2.getMarks());
	}
	
}

class SortStudentOnName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}


public class assignment8_q1 {
	public static List<Student> studentList=new ArrayList<>();
	public static Student std;
	
	
	public static Student validStudent(int roll) {
		Student tempStudent=new Student();
		tempStudent.setRoll(roll);
		for(Student actstd : studentList) {
			if(actstd.equals(tempStudent)) {
				return actstd;
			}
		}
		return null;
	}
	
	public static void addStudent() {
		System.out.println("Enter a roll number : ");
		int roll=new Scanner(System.in).nextInt();
		if(validStudent(roll)!=null) {
			System.out.println("Student ID already present");
			addStudent();
			return;
		}
		System.out.println("Enter a Name : ");
		String name=new Scanner(System.in).nextLine();
		System.out.println("Enter a Marks : ");
		double marks=new Scanner(System.in).nextDouble();
		Student temp=new Student(roll,name,marks);
		studentList.add(temp);
	}
	
	
	public static void displayStudent() {
		for(Student	 emp:studentList) {
			System.out.println(emp.toString());
		}
	}
	
	public static void searchStudent() {
		System.out.println("Enter a roll number : ");
		int roll=new Scanner(System.in).nextInt();
		Student std=validStudent(roll);
		if(std!=null) {
			System.out.println(std.toString());
			return;
		}
		System.out.println("Student not found....");
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2.Display All Students");
		System.out.println("3.Search Student");
		System.out.println("4.Sort the students on rollno ");
		System.out.println("5.Sort the students on name ");
		System.out.println("6.Sort the students on marks ");
		System.out.println("Enter a choice : ");
		return new Scanner(System.in).nextInt();
	}
	
	
	public static void main(String [] args) {
		int choice=0;
		while((choice=menuList())!=0) {
			switch(choice) {
			case 1: addStudent();break;
			case 2: displayStudent();break;
			case 3: searchStudent();break;
			case 4: studentList.sort(new SortStudentOnRollNo());displayStudent();break;
			case 5: studentList.sort(new SortStudentOnName());displayStudent();break;
			case 6: studentList.sort(new SortStudentOnMarks());displayStudent();break;
			}
		}
	}
}
