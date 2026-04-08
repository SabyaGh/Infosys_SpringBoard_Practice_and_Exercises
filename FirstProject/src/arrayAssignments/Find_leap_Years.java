package arrayAssignments;
/*
 * Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. 
 * Include the year passed as parameter if it is a leap year. 
 * Implement the logic inside findLeapYears() method and return an int array containing all the leap years.
 * 
 * 
 *[ Hint: Any year which is divisible by 4 and not by 100 are leap years. 
 *Otherwise, any year which is divisible by 400 is also a leap year]
 */

public class Find_leap_Years {
	 public static int[] findLeapYears(int year){
		int leapyear[] = new int[15];
		int counter = 0;
		int yearNow = year;
		while(counter<15) {
			if((yearNow%4==0 && yearNow%100!=0) ||(yearNow%400==0)) {
				leapyear[counter]= yearNow;
				counter++;
				
			}
			yearNow = yearNow+1;
	   }
		 return leapyear;
	 }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }

}
