import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Student{
	private int rollno;
	private String name;
	private int marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
}


public class Assignment_9_1 {
	
	public static List<Student> list=new ArrayList<>();
	public static Scanner sc=new Scanner(System.in);
	
	
	public static int menuList()
	{
		int choice;

		System.out.println("0. Exit");
		System.out.println("1. Add Students");
		System.out.println("2. Display All");
		System.out.println("3. Search student using rollno");
		System.out.println("4. Sort the students on rollno");
		System.out.println("5. Sort the students on name");
		System.out.println("6. Sort the students on marks");
		System.out.println("Enter your choice ---------------------");
		choice=sc.nextInt();
		return choice;

	}

	public static void addStudent(){
		Student[] arr= new Student[]{
				new Student(104,"akash",90),
				new Student(103,"rohit",85),
				new Student(102,"amar",100),
				new Student(101,"atul",99)	
		};
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}	
	}
	
	public static void DisplayAll()
	{
		ListIterator<Student> trav = list.listIterator();
		while(trav.hasNext())
		{
			Student temp=trav.next();
			System.out.println(temp);
		}
	}
	
	public static Student search(int roll)
	{
		for(int i=0;i<list.size();i++)
		{
			if(roll==list.get(i).getRollno())
			{
				return list.get(i);
			}
		}
		return null;
	}
	
	public static void displayStudent(Student s)
	{
		if(s==null)
		{
			System.out.println("Student Not Found");
		}else {
			System.out.println(s.toString());
		}
	}
	
	public static void sortRoll()
	{
		Collections.sort(list,(x,y)->x.getRollno()-y.getRollno());
		DisplayAll();
	}
	
	public static void sortName()
	{
		Collections.sort(list,(x,y)->x.getName().compareTo(y.getName()));
		DisplayAll();
	}
	
	public static void sortMarks()
	{
		Collections.sort(list,(x,y)->x.getMarks()-y.getMarks());
		DisplayAll();
	}
	
	
	
	public static void main(String[] args) {
		
		int choice;
		while((choice=menuList())!=0)
		{
			switch(choice)
			{
				case 1:
					list.clear();
					addStudent();
					break;
				
				case 2:
					DisplayAll();
					break;
				
				case 3:
					System.out.println("Enter the roll no of the student");
					int n=sc.nextInt();
					Student s=search(n);
					displayStudent(s);
					break;
					
				case 4:
					sortRoll();
					break;
					
				case 5:
					sortName();
					break;
					
				case 6:
					sortMarks();
					break;
					
				default :
					System.out.println("Invalid Choice : ");
					
					
			}
		}
		
	}

}



































