package com.infy;

public class Order {
	//instance Variables
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	private String status;
	//Constructor
	public Order(int orderId,String orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		status = "Ordered";
		}
	public Order() {
		status = "Ordered";
	}
	//Getter and Setter Methods
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int unitPrice) {
		totalPrice =calculateTotalPrice(unitPrice);	
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	//Method
	public double calculateTotalPrice(int unitPrice) {
		
		totalPrice = unitPrice +(unitPrice*0.05);// Total Price after charges
		return totalPrice;
	}
}
