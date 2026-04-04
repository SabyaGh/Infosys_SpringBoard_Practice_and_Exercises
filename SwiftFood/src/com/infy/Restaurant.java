package com.infy;

public class Restaurant {
	public String restaurantName;
	public String restaurantAddress;
	public long restaurantContact;
	public float rating;
	
	public Restaurant(String restaurantName,long restaurantContact,String restaurantAddress,float rating) {
		this.restaurantName = restaurantName;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
		
	}
	
	public void displayRestaurantDetails() {
		System.out.println("Restaurant Details \n******************");
		System.out.println("Restaurant Name : "+restaurantName);
		System.out.println("Restaurant Rating : "+rating);
		System.out.println("Restaurant Contact : "+restaurantContact);
		System.out.println("Restaurant Address : "+restaurantAddress);
	}

}
