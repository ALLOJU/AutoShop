package com.bridgelabz;

public class Sedan extends Car {
	/**
	 * declaring instance variable as int
	 */
	private int length;
	/**
	 * calculate get sales price using its super class method
	 */
	public double getSalePrice()
	{
		/**
		 * if length is greater than 20 feet,then we need to give 5% discount on sales price
		 */
		if(length >20)
		{
			return super.getSalePrice() -(0.05 *super.getSalePrice());
		}
		/**
		 * otherwise we need to give 10% discount on sales price
		 */
		else
		{
			return super.getSalePrice() -(0.1 *super.getSalePrice());
		}
	}
	/**
	 * Creating constructor with 4 given parameters as given
	 * @param speed - input parameter
	 * @param regularPrice - input parameter
	 * @param color - input parameter
	 * @param length - input parameter
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

}
