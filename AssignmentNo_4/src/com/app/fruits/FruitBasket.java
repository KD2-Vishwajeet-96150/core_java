package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
	public static Scanner sc = new Scanner(System.in);
	public static int menulist() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.show all fruit names");
		System.out.println("5.show all fresh fruits with information ");
		System.out.println("6.show all stale fruits");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		return choice;
		
	}
	
	public static void acceptRecord(Fruit fruit) {
			String option;
			boolean isFresh=false;

			 System.out.println("Enter Color:");
			    fruit.setColor(sc.next());

			    System.out.println("Enter Weight:");
			    fruit.setWeight(sc.nextDouble());

			    System.out.println("Enter Name:");
			    fruit.setName(sc.next());

			    System.out.println("Is Fresh (yes/no):");
			    option = sc.next();

			   fruit.setFresh(option.equalsIgnoreCase("yes"));
			if(option.equalsIgnoreCase("yes")) {
				isFresh = true;
			}
			fruit.setFresh(isFresh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int size;
		int counter = 0;
		
		System.out.println("Enter furit basked size :");
		size = sc.nextInt();
		if(size <= 0) {
			System.out.println("Basket size can not be zero or negative");
			return;
		}
		Fruit[] fruit = new Fruit[size];
		while((choice = menulist()) !=0) {

			

			switch(choice) {
			case 1:
				if(counter < size) {		
					System.out.println("---------Mango-------");
					fruit[counter] = new Mango();
				}
				break;
			case 2:
				if(counter < size) {	
					System.out.println("---------Oranage-------");
					fruit[counter] = new Orange();
				}
				
				break;
			case 3:
				if(counter < size) {
					System.out.println("---------Apple-------");
					fruit[counter] = new Apple();					
				}
				
				break;
			case 4:
				if(fruit[counter] == null) {
					System.out.println("there is no fruits");
				}
				for(int i = 0;i < counter;i++) {
				System.out.println( fruit[i].getName());
			     }
				break;
			case 5:
				for(int i = 0;i < counter;i++) {
				if(fruit[i].isFresh() == true) {
					System.out.println( fruit[i]);
					System.out.println(fruit[i].taste());					
				     }
			    }
				break;
			case 6:
				for(int i = 0;i < counter;i++) {
				if(fruit[i].isFresh() == false) {
//					System.out.println( fruit[i]);
					System.out.println(fruit[i].getName()+" = "+fruit[i].taste());					
				     }
			    }
				break;
			case 7:
				try {
					int index;
					System.out.println("Enter index of gruit to update state");
					index = sc.nextInt();
					if(index < 0 || index >= fruit.length)
					{
						throw new ArrayIndexOutOfBoundsException("index does not exist");
					}
					if(fruit[index].isFresh() == false) {
						System.out.println("fruit is already stale");
					}else {						
						fruit[index].setFresh(false);
						if(fruit[index].isFresh() == false) {
							System.out.println("fruit is marked as stale");
						}else {
							System.out.println("fruit is not marked as stale");
						}
					}

					
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
			}
			
			
			try {
				
			if(fruit[counter] != null) {
				FruitBasket.acceptRecord(fruit[counter]);
				if(counter == fruit.length) {
					throw new ArrayIndexOutOfBoundsException();
				}
				counter++;					
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Basket is full");
			}
		}
		
		
		
		
		

	}

}
