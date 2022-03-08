package com.bridgelabz;

public class Truck extends Car{

	/**
	 * declaring instance variables
	 */
	private int weight;
	/**
	 * Creating constructor with 3 given parameters as given
	 * @param speed - input as speed
	 * @param regularPrice - input parameter
	 * @param color -  input parameter
	 * @param weight - - input parameter
	 */
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	/**
	 * calculate get sales price using its super class method
	 */
	public double getSalePrice() {
		/**
		 * if weight is greater than 2000,then we need to give 10% discount on sales price
		 */
		if(weight > 2000) {
			return super.getSalePrice() -( 0.1 * super.getSalePrice())  ;
		}
		/**
		 * otherwise we need to give 20% discount on sales price
		 */
		else {
			return super.getSalePrice() -(0.2 * super.getSalePrice());
		}
		
	} 
	
}
