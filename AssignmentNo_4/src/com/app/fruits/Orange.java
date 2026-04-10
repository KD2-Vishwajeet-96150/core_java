package com.app.fruits;

public class Orange extends Fruit {
	
	
	public Orange() {
		
	}
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	public String taste() {
		return "sweet";
	}
	@Override
	public String toString() {
		return "State [name : "+name+" color : "+color+" weight : "+weight+"]";
	}

}
