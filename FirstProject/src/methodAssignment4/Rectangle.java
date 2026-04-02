package methodAssignment4;

public class Rectangle {
	public float length;
	public float width;
	
	public double calculateArea() {
		double Area = length*width;//local variable
		return Math.round(Area*100.0)/100.0;
	}
	
	public double calculatePerimeter() {
		double perimeter = 2*(length+width);
		return Math.round(perimeter*100.0)/100.0;
	}

}
