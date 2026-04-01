package com.infy;

public class Tester {
	public static void main(String args[]) {
		// Object creation
		Customer customer = new Customer();
		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
		
		customer.displayCustomerDetails();
		
		}

}
