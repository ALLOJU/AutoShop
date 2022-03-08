package com.bridgelabz;

public class Car {
	
	
	/**
	 * declaring instance variables
	 */
	private int speed;
	private double regularPrice;
	private String color;
	/**
	 * return regular price using getters method
	 * @return
	 */
	double getSalePrice() {
		return regularPrice;

	}
	/**
	 * here created parametrized constructor using 3 fields
	 * @param speed - input taken speed
	 * @param regularPrice - input of regular price
	 * @param color - input for color
	 */
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	

}
