package com.bridgelabz;

public class Ford extends Car{
	/**
	 * declaring instance variables
	 */
	private int year;
	private int manufacturerDiscount;
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	/**
	 * method to give sales price
	 */
	public double getSalePrice()
	{
		return (super.getSalePrice()-manufacturerDiscount);
	}
}
