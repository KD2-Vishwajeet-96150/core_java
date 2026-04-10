package com.sunbeam;

import java.util.Scanner;

/*
Q1) Create Java application for fixed stack & growable stack based on Stack 
interface, for storing emp details.  
1.1  Create Employee class -- id,name,salary, constructor,toString 
1.2 Stack interface -- push & pop functionality for Emp refs. & declare 
STACK_SIZE as a constant.  
1.3 Create implementation class of Stack i/f -- FixedStack (array based) 
1.4 Create another implementation class of Stack i/f-- GrowableStack (array 
based) 
1.5 Create Tester class (Hint :  use dynamic method dispatch using 
interfaces) 
Display Menu 
Note : Must use 1 switch-case only. You won't need any complex nested 
control structure 
Once user selects either fixed or growable stack , user shouldn't be allowed 
to change the selection of the stack. 
(Hint : null checking) 
1 -- Choose Fixed Stack 
2 -- Choose Growable Stack 
Accept following options only after initial selection.(Hint : null checking) 
3 -- Push data  
I/P : Accept emp details & store these details in the earlier chosen stack or 
give error mesg : NO stack chosen !!! 
4 --- Pop data & display the same (from the earlier chosen stack or give error 
mesg : NO stack chosen !!!) 
No inputs are required : pop emp details from the top of the stack 
5 -- Exit
 * 
 * 
 */


public class Assignment7_q1 {
	
	public static int menu() {
		System.out.println("0.exit");
		System.out.println("1.Fixed Stack");
		System.out.println("2.Growable Stack");
		System.out.println("3.Push() into Stack");
		System.out.println("4.Pop() from Stack");
		System.out.println("5.peek()");
		System.out.println("Enter choice : ");
		return new Scanner(System.in).nextInt();
	}
	


	public static void main(String[] args) {
		int choice=0;
		Stack<Employee> stk=null;
		Employee emp=new Employee();
		boolean flag=false;
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:{
				if(flag) {
					System.out.println("Stack already selected.....");break;
				}
				stk=new FixStack<>(); flag=true ; break;
				
			}
			case 2:{
				if(flag) {
					System.out.println("Stack already selected.....");break;
				}
				stk=new GrowableStack<>();flag=true ;break;
			}
			case 3:{
				if(stk==null) {
					System.out.println("Select Stack First");break;
				}
				if(stk instanceof FixStack) {
					FixStack<Employee> fs=(FixStack)stk;
					System.out.println("Enter a push value : ");
					emp.acceptRecord();
					stk.push(emp);
					System.out.println("Employee added successfully....");
				}
				else if(stk instanceof GrowableStack) {
					GrowableStack<Employee> gs=(GrowableStack)stk;
					System.out.println("Enter a push value : ");
//					emp.acceptRecord()
					emp.acceptRecord();
					gs.push(emp);
					System.out.println("Employee added successfully....");
				}
				break;
			}
			case 4:{
				if(stk==null) {
					System.out.println("Select Stack First");break;
				}
				if(stk instanceof FixStack) {
					FixStack<Employee> fs=(FixStack)stk;
					Employee popEmp=fs.pop();
					if(popEmp==null) {
						break;
					}
						System.out.println(popEmp.toString());
					System.out.println("Employee remove successfully....");
				}
				else if(stk instanceof GrowableStack) {
					GrowableStack<Employee> gs=(GrowableStack)stk;
					Employee popEmp=gs.pop();
					if(popEmp==null) {
						break;
					}
					System.out.println(popEmp.toString());
					System.out.println("Employee remove successfully....");
				}
				break;
			}
			case 5:{
				if(stk==null) {
					System.out.println("Select Stack First");break;
				}
				if(stk instanceof FixStack) {
					FixStack<Employee> fs=(FixStack)stk;
					fs.peek();
				}
				else if(stk instanceof GrowableStack) {
					GrowableStack<Employee> gs=(GrowableStack)stk;
					gs.peek();
				}
			}
			}
		}
	}

}

