package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//1. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven program to
//1. Add new book in list
//2. Display all books in forward order
//3. Display all books in reverse order
//4. Delete a book at given index.
//5. Sort all books by price in desc order -- list.sort();

class sortByPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		int diff = -Double.compare(b1.getPrice(), b2.getPrice());
		return diff;
	}
}

public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	public static List<Book> bookList = new ArrayList<>();
	
	public static void addBook() {
		Book bk = new Book();
		System.out.println("book Number :");
		String isbn = sc.next();
		bk.setIsbn(isbn);
		System.out.println("Price :");
		Double price = sc.nextDouble();
		bk.setPrice(price);
		sc.nextLine();
		System.out.println("authorName :");
		String authorName = sc.nextLine();
		bk.setAuthorName(authorName);
		System.out.println("Quantity :");
		int quantity = sc.nextInt();
		bk.setQuantity(quantity);
		bookList.add(bk);
		
	}
	
	public static boolean deleteBook() {
		Book bk = new Book();
		System.out.println("Enter isbn:");
		sc.nextLine();		
		bk.setIsbn(sc.nextLine());
		if(bookList.contains(bk)) {
			bookList.remove(bk);
			return true;
		}
		return false;
		
			
		
	}
	
	public static void printBook() {
		for(Book book :bookList) {
			System.out.println(book);
		}
	}
	
	
	
	public static int menuList() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Display all books in forwrad");
		System.out.println("3.Display all books in reverse");
		System.out.println("4.Delete a book at given index");
		System.out.println("5.Sort all books by price in desc order");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		return choice;
	}
	

	public static void main(String[] args) {
		int choice;
		
		while((choice = menuList()) !=0) {
			switch(choice){
			case 1:
				addBook();
				break;
			case 2:
				printBook();
				break;
			case 3:
				Collections.reverse(bookList);
				for(Book bl :bookList) {
					System.out.println(bl);
				}
				break;
			case 4:
				boolean remove = deleteBook();
				System.out.println(remove?"Book is removed":"Book not found");
				break;
			case 5:
				bookList.sort(new sortByPrice());
				for(Book bl :bookList) {
					System.out.println(bl);
				}
			}
			
		}
		
		
	}

}
