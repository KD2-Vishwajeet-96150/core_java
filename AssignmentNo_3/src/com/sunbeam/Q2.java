package com.sunbeam;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Beginning Balance: ");
        beginningBalance = sc.nextInt();

        System.out.print("Enter Total Charges: ");
        charges = sc.nextInt();

        System.out.print("Enter Total Credits: ");
        credits = sc.nextInt();

        System.out.print("Enter Credit Limit: ");
        creditLimit = sc.nextInt();

        // Calculate new balance
        newBalance = beginningBalance + charges - credits;

        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

        sc.close();
    }
}
