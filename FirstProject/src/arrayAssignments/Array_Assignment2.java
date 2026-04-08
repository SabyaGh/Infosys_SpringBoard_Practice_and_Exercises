package arrayAssignments;
/*
 *  Find and return the average salary, 
 *  number of salaries greater than the average salary and
 *  number of salaries lesser than the average salary 
 *  from the salary array passed to the findDetails() method. 
 *  Return a double array containing average salary in index position 0, 
 *  number of salaries greater than the average salary in index position 1 and 
 *  number of salaries lesser than the average salary in index position 2. 
 *  
 *  Implement the logic inside findDetails() method.
 */

public class Array_Assignment2 {
	public static double[] findDetails(double[] salary) {
		double details[] = new double[3];
		double sum =0;
		double avg = 0;
		double counter= 0;
		double salaryGreterThanAvg =0;
		double salaryLessThanAvg = 0;
		
		for(int i = 0;i<salary.length;i++) {
			sum +=salary[i];
			counter++;
		}
		avg = sum/counter;
		details[0] = avg;
		
		for(int j = 0;j<salary.length;j++) {
			if(salary[j]>details[0]) {
				salaryGreterThanAvg++;
			}
			else if(salary[j]<details[0]) {
				salaryLessThanAvg++;
			}
			
		}
		details[1]= salaryGreterThanAvg;
		details[2] = salaryLessThanAvg;
        return details;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }

}
