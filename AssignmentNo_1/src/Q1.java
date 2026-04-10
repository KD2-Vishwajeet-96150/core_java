//1. Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : toBinaryString() , toOctalString(), toHexString()

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter a number :");
		a=sc.nextInt();
		Integer b = new Integer(a);
		String binary = Integer.toBinaryString(a);
		String octal = Integer.toOctalString(a);
		String hexaDecimal = Integer.toHexString(a);
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexaDecimal);
		
		

	}

}
