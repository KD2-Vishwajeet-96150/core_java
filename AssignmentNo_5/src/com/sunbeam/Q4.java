package com.sunbeam;
//Q4) Write an enum type TrafficLight, whose constants (RED,
//GREEN, YELLOW) take one parameter—the duration of the
//light.Write a program to test the TrafficLight enum so that it
//displays the enum constants and their durations.\

enum TrafficLight{
	RED(30)
	,GREEN(45),
	YELLOW(5);
	private int duration;
	private TrafficLight(int duration) {
		// TODO Auto-generated constructor stub
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (TrafficLight light : TrafficLight.values()) {
	            System.out.println(light + " duration: " + light.getDuration() + " seconds");
	        }

	}

}
