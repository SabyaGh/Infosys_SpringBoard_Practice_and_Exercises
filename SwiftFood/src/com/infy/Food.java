package com.infy;

public class Food {
	private String foodName;
	private String cuisine;
	private String foodType;
	private int quantityAvailable;
	private double unitPrice;
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	public int getAvailableQuantity() {
		return quantityAvailable;
	}
	public void setAvailableQuantity(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
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
