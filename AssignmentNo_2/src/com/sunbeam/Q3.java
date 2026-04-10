package com.sunbeam;
import java.util.Scanner;

class Date{
	private int month;
	private int day;
	private int year;
	
	Date(){
		
	}

	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println(month+"/"+day+"/"+year);
	}
}

class DateTest{
	Scanner sc = new Scanner(System.in);
	public void acceptDate(Date date){
		System.out.println("Enter month :");
		int month = sc.nextInt();
		date.setMonth(month);
		
		System.out.println("Enter day :");
		int day = sc.nextInt();
		date.setDay(day);
		
		System.out.println("Enter year :");
		int year = sc.nextInt();
		date.setYear(year);
		
	}
	
	public void printDate(Date date){
		date.displayDate();
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		DateTest dt = new DateTest();
		dt.acceptDate(date);
		dt.printDate(date);

	}

}
