package staticAssignment4;

public class Booking {
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	
	//static variable
	private static int seatsAvailable;
	
	//static block
	static {
		seatsAvailable = 400;
	}
	
	//Constructor
	public Booking(String customerEmail, int seatsRequired) {
		this.customerEmail=customerEmail;
		this.seatsRequired = seatsRequired;
		if(this.seatsRequired <= Booking.seatsAvailable) {
			isBooked = true;
			Booking.setSeatsAvailable(Booking.seatsAvailable - seatsRequired);
		}
		else
		{
			isBooked = false;
		}
	}
	
	//Getter & Setter
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}
	
	

}
