package com.sunbeam;
import java.util.Scanner;

class Invoice{
	private String pNum;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice() {
	}
	
	public Invoice(String pNum, String description, int quantity, double price){
		this.pNum = pNum;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
			return;
		}
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0;
			return;
		}
		this.price = price;
	}
	
	public double totalAmount() {
		double total=0;
		total = total + price * quantity;
		return total;
	}
	
	
}

class InvoiceTest{
//	Invoice in = new Invoice();
	Scanner sc = new Scanner(System.in);
	
	public void accept(Invoice in) {
		System.out.println("Enter part number:");
		String pNum = sc.next();
		in.setpNum(pNum);
		
		sc.nextLine();
		System.out.println("Enter Description :");
		String description = sc.nextLine();
		in.setDescription(description);
		
		System.out.println("Enter Quantity:");
		int quantity = sc.nextInt();
		in.setQuantity(quantity);
		
		System.out.println("Enter price :");
		double price = sc.nextDouble();
		in.setPrice(price);
		
	}
	
	public void print(Invoice in) {
		System.out.println("Part Num :"+in.getpNum());
		System.out.println("Description :"+in.getDescription());
		System.out.println("Quantity :"+in.getQuantity());
		System.out.println("Price :"+in.getPrice());
		double total = in.totalAmount();
		System.out.println("Total Amount:"+total);
	}
	

	
	
	
	
}

public class Q1 {

	public static void main(String[] args) {
		Invoice in = new Invoice();
		InvoiceTest it = new InvoiceTest();
		it.accept(in);
		it.print(in);


	}

}
