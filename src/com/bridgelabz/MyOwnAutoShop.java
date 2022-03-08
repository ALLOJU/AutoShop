package com.bridgelabz;

public class MyOwnAutoShop {
	/**
	 * Purpose: Main method to manipulate MyOwnAutoShop
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1. Creating an instance of Sedan class and initialize all the fields with appropriate
		 *    values. Using super(...) method in the constructor for initializing the fields of the
		 *    superclass.
		 */
		Sedan sedan=new Sedan(160, 20000, "Red", 10);
		/**
		 * 2. Create two instances of the Ford class and initialize all the fields with appropriate
		 *    values. Using super(...) method in the constructor for initializing the fields of the
		 *    super class.
		 */
		Ford ford=new Ford(156,4452.0,"Black",2005, 10);
		/**
		 * 3. Creating an instance of Car class and initialize all the fields with appropriate
              values.
		 */
		Car car=new Car(555, 56856.0, "White");
		/**
		 * Displaying Sales price of all objects we have created 
		 */
		System.out.println("Sedan Price is %.2f :"+sedan.getSalePrice());
		System.out.println("Ford Price is %.2f :"+ford.getSalePrice());
		System.out.println("Car Price is %.2f :"+car.getSalePrice());

		
	}
}
