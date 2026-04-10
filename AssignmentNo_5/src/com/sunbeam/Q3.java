package com.sunbeam;
import java.util.Scanner;
//Q3) write a java program to count number of words in a String.
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter String :");
		String str = sc.nextLine();
		String[] str1 = str.trim().split("\\s+");
		System.out.println("Number of words :"+str1.length);
	}

}
