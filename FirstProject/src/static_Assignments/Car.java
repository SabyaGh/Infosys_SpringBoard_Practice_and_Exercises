package static_Assignments;

public class Car {
	private static String color;
	private static int numberOfCars = 0;

	static {
		System.out.println("Car class loaded");
	}

	public Car(String color) {
		this.color = color;
		numberOfCars++;
	}

	public static String getColor() {
		return Car.color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

}
