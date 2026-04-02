package methodAssignments3;

public class Calculator {
	public int num;
	
	public int sumOfDigits() {
		int intermediate;
		int sum = 0;
		
		while(num>0) {
			 intermediate = num%10;
			 sum = sum+intermediate;
			 num = num/10;
		}
		return sum;
	}

}
