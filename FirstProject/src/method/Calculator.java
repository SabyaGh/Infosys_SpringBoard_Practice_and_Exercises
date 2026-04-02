package method;

public class Calculator {
	double avg = 0;
	public double findAverage(int num1,int num2, int num3) {
		avg = (num1+num2+num3)/3.0;
		return  Math.round(avg*100.0)/100.0;
	}

}
