package iterationAssignment;
import java.util.Scanner;
public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1=");
		int num1 = sc.nextInt();
		
		System.out.println("num2=");
		int num2=sc.nextInt();
		
		int max= 0;
		if(num1>num2) {
			max = num1;
		}
		else {
			max = num2;
		}
		boolean solution = false;
		
		
		while (!solution) {
			
			if(max%num1==0 && max%num2 ==0) {
				System.out.println(max);
				solution = true;
				break;
			}
			else {
				max+=1;
			}
		}
		sc.close();
	}

}
