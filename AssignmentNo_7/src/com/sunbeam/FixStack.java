package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class FixStack<Employee> implements Stack<Employee>{

	public final int STACK_SIZE=5;
	public List<Employee>fixArr=new ArrayList<>();
	int top=-1;
	

	@Override
	public void push(Employee emp) {
		
		if(top==STACK_SIZE-1) {
			System.out.println("StackOverFlow");
			return;
		}
		top++;
		fixArr.add(emp);
	}

	@Override
	public Employee pop() {
		if(top==-1) {
			System.out.println("StackUnderFlow");
			return null;
		}
		Employee temp=fixArr.remove(top--);
		
		return temp;
		
	}
	
	@Override
	public void peek() {
		int count=top++;
		System.out.println("Total elements : "+count);
		if(top==-1) {
			return;
		}
		System.out.println(fixArr.get(top).toString());
	}
	
	
	
}

