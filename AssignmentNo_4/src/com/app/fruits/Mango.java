package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
	
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	public String taste() {
		return "sour";
	}
	
	@Override
	public String toString() {
		return "State [name :"+name+" color :"+color+" weight :"+weight+"]";
	}
}
