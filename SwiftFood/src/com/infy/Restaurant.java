package com.infy;

public class Restaurant {
	public String restaurantName;
	public String restaurantAddress;
	public long[] restaurantContact;
	public float rating;
	
	public Restaurant(String restaurantName,long[] restaurantContact,String restaurantAddress,float rating) {
		this.restaurantName = restaurantName;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
		
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public long[] getRestaurantContact() {
		return restaurantContact;
	}
	public void setRestaurantContact(long[] restaurantContact) {
		this.restaurantContact = restaurantContact;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}

	
	public void displayRestaurantDetails() {
		System.out.println("Restaurant Details \n******************");
		System.out.println("Restaurant Name : "+restaurantName);
		System.out.println("Restaurant Rating : "+rating);
		System.out.println("Restaurant Contact : ");
		for(long contact:restaurantContact) {
		System.out.println(contact);
		}
		System.out.println("Restaurant Address : "+restaurantAddress);
	}

}
