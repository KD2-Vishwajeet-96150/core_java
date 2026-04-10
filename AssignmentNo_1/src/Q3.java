//3. Display food menu to user. User will select items from menu along with the quantity. 
//(eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill )
//Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		double food;
		double total=0;
		int quantity=0;
		int choice=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0.Exit");
			System.out.println("1.Dosa ,Price :100.0");
			System.out.println("2.Samosa ,Price:50.0");
			System.out.println("3.Idli ,Price:30.0");
			System.out.println("4.Genrate Bill:");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter quantity:");
				quantity = sc.nextInt();
				food = 100.0;
				total =total + quantity * food;
				break;
			case 2:
				System.out.println("Enter quantity:");
				quantity = sc.nextInt();
				food = 50.0;
				total = total + quantity * food;
				break;
			case 3:
				System.out.println("Enter quantity:");
				quantity = sc.nextInt();
				food = 30.0;
				total = total + quantity * food;
				break;
			case 4:
				System.out.println("Total Bill:"+total);
				break;
			}
			
			
		}while(choice !=0);
		

	}

}
