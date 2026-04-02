package methodAssignment4;

public class Tester {
	public static void main(String[] arg) {
		Rectangle rectangle = new Rectangle();
		rectangle.length = 12f;
		rectangle.width = 5f;
		System.out.println("Area of the rectangle is "+rectangle.calculateArea());
		System.out.println("Perimeter of the rectangle is "+rectangle.calculatePerimeter());
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.length = 6f;
		rectangle2.width = 3f;
		System.out.println("Area of the rectangle is "+rectangle2.calculateArea());
		System.out.println("Perimeter of the rectangle is "+rectangle2.calculatePerimeter());
		
	}

}
