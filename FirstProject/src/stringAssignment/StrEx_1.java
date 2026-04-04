package stringAssignment;

public class StrEx_1 {
	public static String removeWhiteSpaces(String str) {
		String str2 = str.replace(" ", "");
		return str2;
	}
	
	public static void main(String[] args) {
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}

}
