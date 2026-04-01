package com.infy;

public class Food {
	public String foodName;
	public String cuisine;
	public String foodType;
	public int quantityAvailable;
	public double unitPrice;
	
	public void displayFoodDetails() {
		System.out.println("Displaying Food Details \n***********");
		System.out.println("Food Name : "+foodName);
		System.out.println("Cuisine : "+cuisine);
		System.out.println("Food Type : "+foodType);
		System.out.println("Quantity Available : "+quantityAvailable);
		System.out.println("Unit Price : "+ unitPrice);
		System.out.println();
	}

}
