package stringAssignment;

/*
 * This program is Created to
 * Move all the special characters present in the string passed to 
 * the method to the end of the string and return the modified string.
 * */


public class StrEx_2 {
	 public static String moveSpecialCharacters(String str){
			String normalChar = "";
			String speChar = "";
			for(int i = 0; i<str.length();i++){
			    if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
			        normalChar = normalChar+str.charAt(i);
			    }
			    else
			    {
			        speChar = speChar+str.charAt(i);
			    }
			}
	        return (normalChar+speChar);
		}
		
		public static void main(String args[]){
		    String str = "He@#$llo!*&";
		    System.out.println(moveSpecialCharacters(str));
		}

}
