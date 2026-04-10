package com.sunbeam;
//Q2) Write a java code to check string is palindrome.

import java.util.Scanner;

public class Q2 {

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
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
