package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

//Q3) Write a Java program to replace the second element of a ArrayList with 
//the specified element. 


public class Assignment7_q3 {
	public static void main(String [] args) {
		List<String> list=new ArrayList<>();
//				("sumit","pranav","amit","sandesh");
		list.add("sumit");
		list.add("pranav");
		list.add("sandesh");
		list.add("amit");
		list.set(1,"PRANAV");
//		list.remove(1);
//		list.add(1, "PRANAV");
		System.out.println(list.toString());
		

	}
}
