package stringAssignment;


/* 
 * This Program is Created to 
 * Find the count of the highest occurring character in the string passed to the method and return the count.
 */
public class StrEx_5 {
	public static int findHighestOccurrence(String str){
		int charCount[] = new int[256];
		int maxCount = 0;
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			charCount[ch]++;// it increments the ASCII character index 
			if(charCount[ch]>maxCount) {
				maxCount = charCount[ch];
			}
		}
		
        return maxCount;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}

}
