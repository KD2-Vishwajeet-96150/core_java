package com.sunbeam;
 import java.lang.String;
 import java.util.Scanner;

//Q1) Write a java program to reverse a String
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str= sc.nextLine();
		String reverse="";
		for(int i =str.length()-1;i>=0;i--) {
//			System.out.println(str.charAt(i));
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
		
		
	}

}
