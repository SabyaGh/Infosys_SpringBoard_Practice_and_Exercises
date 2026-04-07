package stringAssignment;

/* this program is to Reverse each word in the string passed 
 * to the method without changing the order of the words and 
 * return the modified string.*/

public class StEx_4 {
	  public static String reverseEachWord(String str){
		  	String rev = "";
		    String [] words = str.split(" ");
		    int c=0;
		    for(String word :words)
		    {
		    	c++;
		    	for(int i = word.length()-1;i>=0;i--) {
		    		rev = rev+word.charAt(i);
		    	}
		    	if(c!=words.length)
		    	rev +=" ";
		    	
		    }
		    
	        return rev;
		}
		
		public static void main(String args[]){
		    String str = "all cows eat grass";
		    System.out.println(reverseEachWord(str));
		}

}
