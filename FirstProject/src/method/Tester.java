package method;

import java.util.Scanner;

	public class Tester {
		public static void main(String [] args) {
			Calculator calculator = new Calculator();
			int num1= 0;
			int num2 = 0;
			int num3 = 0;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Num1 = ");
			num1 = scan.nextInt();
			
			System.out.println("Num2 = ");
			num2 = scan.nextInt();
			
			System.out.println("Num3 = ");
			num3 = scan.nextInt();
			
			System.out.println(calculator.findAverage(num1, num2, num3));
			
			scan.close();
		}

	}

