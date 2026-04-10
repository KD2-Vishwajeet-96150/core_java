package com.app.geometry;


public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		
		return "x :"+x+"y :"+y;
	}
	
	public boolean isEqual(Point2D obj) {
		Point2D other = obj;
		if(this.x == other.x && this.y == other.y) {
			return true;
		}
		
		return false;
	}
	
	public double calculateDistance(Point2D obj){
		double distance;
		Point2D other = obj;
		distance =Math.sqrt(Math.pow((other.x - this.x),2) + Math.pow((other.y - this.y),2));
		return distance;
	} 
	
	

}
