package stringAssignment;

/*
 * This program is created to 
 * Check whether the string passed to the method is a palindrome or not. 
 * Return true if the string is palindrome, else return false.*/

public class StrEx_3 {
	    public static boolean checkPalindrome(String str){
		   String newS = "";
		   for(int i = str.length()-1; i>=0; i--){
		       newS = newS+str.charAt(i);
		   }
		   if(str.equals(newS)){
		       return true;
		   }
	        else{
	            return false;
	        }
	        
		}
		
		public static void main(String args[]){
			String str = "radar";
			if(checkPalindrome(str))
				System.out.println("The string is a palindrome!");
			else
				System.out.println("The string is not a palindrome!");
		}
	}


