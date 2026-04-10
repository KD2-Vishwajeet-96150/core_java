package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(){
		
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	public String taste() {
		return "sweet and sour";
	}
	
	@Override
	public String toString() {
		return "State [name : "+name+" color : "+color+" weight : "+weight+"]";
	}
	
	
	
}
