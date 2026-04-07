package stringAssignment;

/*
 * This program is created to 
 * Remove all the duplicate characters and white spaces from the string passed to the method and return the modified string.
 */

public class StrEx_6 {
	 public static String removeDuplicatesandSpaces(String str){
	        String ofSpace = str.replace(" ", "");
	        int charCount[] = new int[256];
	       
	        String strWithOutSpacesAndDuplicates = "";
	        
	        for (int i = 0;i<ofSpace.length();i++) {
	        	char ch = ofSpace.charAt(i);
	        	charCount[ch]++;
	        	if(charCount[ch]==1) {
	        		strWithOutSpacesAndDuplicates += ch;
	        	}
	        	else {
	        		continue;
	        	}
	        	
	        }
	        return strWithOutSpacesAndDuplicates;
		}
		
		public static void main(String args[]){
		    String str = "object oriented programming";
		    System.out.println(removeDuplicatesandSpaces(str));
		}

}
