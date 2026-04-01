package iterationAssignment;
import java.util.Scanner;
public class LuckyNumberOrNot {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		
		
		String str = String.valueOf(num);
		int sum = 0;
		
		for(int i = 0; i<=str.length();i++) {
			if((i+1)%2 ==0){
				int digit = str.charAt(i);
				sum+= Math.pow(digit, 2);
			}
		}
		if(sum%9==0) {
			System.out.print("The number "+num+" is a lucky number");
		}
		else 
		{
			System.out.println("The number is not a lucky number");
		}
		
		sc.close();
	}

}
