package methodAssignments3;

public class Tester {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.num = 6547;
		calculator.num = 123;
		System.out.println(calculator.sumOfDigits());// Answer is 22
		System.out.println(calculator.sumOfDigits());//Answer is 6
	}

}
