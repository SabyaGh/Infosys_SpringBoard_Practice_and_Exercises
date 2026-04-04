package com.infy;

public class Tester {
	public static void main(String args[]) {
		// Object creation
//				Customer customer = new Customer();
				// Assigning values to the instance variables
//				customer.customerId = "C101";
//				customer.customerName = "Stephen Abram";
//				customer.contactNumber = 7856341287L;
//				customer.address = "D089, St. Louis Street, Springfield, 62729";
//				customer.displayCustomerDetails();
//				customer.payBill(500, 10);
//				Food myFood = new Food();
//				myFood.displayFoodDetails();
				
//				Customer customer2 = new Customer("jacob",5648394590l,"13th Street, New york");
//				customer2.displayCustomerDetails();
//				
//				Order o1 = new Order(101,"Spinach Alfredo Pasta","Ordered",3);
//				o1.totalPrice=o1.calculateTotalPrice(11);//passing unit price for the food item
//				
//				System.out.println("Order Details");
//				System.out.println("Order Id:"+o1.orderId);
//				System.out.println("Ordered Food:"+o1.orderedFoods);
//				System.out.println("Order Status:"+o1.status);
//				System.out.println("Order Id:"+o1.totalPrice);
				
				// Creating Restaurant Object 
//				Restaurant restaurant = new Restaurant();
//				restaurant.restaurantName = "McDonald's";
//				restaurant.rating = 4.1f;
//				restaurant.restaurantContact = 9988676767l;
//				restaurant.restaurantAddress = "SH1109, Caroline Street, Springfield";
//				restaurant.displayRestaurantDetails();
				
//				Order order1 = new Order();
//				Order order2 = new Order(1001,"Garlic Shirmp");
//				
//				System.out.println("Status of order 1: "+order1.status);
//				System.out.println("Status of order 2: "+order2.status);
//				System.out.println("Id od order 2: "+order2.orderId);
//				System.out.println("Items ordered in order 2: "+order2.orderedFoods);
				long[] restaurantContacts = {9946251306l,6623162904l,7654331896l};
				Restaurant restaurant = new Restaurant("McDonald's",restaurantContacts,"SH1109, Caroline Street, Springfield",4.1f);
				restaurant.displayRestaurantDetails();
				
		}

}
