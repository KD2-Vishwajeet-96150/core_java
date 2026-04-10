//2. Accept 2 double values from User (using Scanner). Check data type. 
//If arguments are not doubles,supply suitable error message & terminate.
//If numbers are double values, print its average.
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1=0;
		double num2=0;
		System.out.println("Enter a number :");
		
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			
			num1 = sc.nextDouble();	
			System.out.println("Enter a number :");
			if(sc.hasNextDouble() && !sc.hasNextInt()) {
				
				num2 = sc.nextDouble();	
				double result = (num1 + num2)/2;
				System.out.println("Average is:"+result);
			}
			else {
				System.out.println("The second entered values are not double type");
			}
		}
		else {
			System.out.println("The first entered values are not double type");
		}
		
		
		
		
			

	}

}
