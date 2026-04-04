package stringAssignment;

public class Tryout {
	
		public static void main(String args[]) {

			// length()
			String str = "Welcome";
			System.out.println(str.length());//7

			// concat()
			String s = "Hello";
			s.concat(" World");
			System.out.println(s);
			// s is still "Hello"
			// String objects are immutable which means they cannot be changed
			// Here, when we concat the two strings a new string object gets created

			String s1 = s.concat("World");
			System.out.println(s1);//HelloWorld

			// + operator can also be used for string concatenation
			String fname = "Jack";
			String lname = "Black";
			System.out.println(fname + " " + lname);// jack Black

			// equals()
			System.out.println(s.equals("Hello"));//true

			// equals compares only the values of the strings
			String s2 = new String("Hello");
			System.out.println(s.equals(s2));//true

			// == compares the object reference and will return false in the below
			// case
			System.out.println(s == s2);//false

			// equalsIgnoreCase()
			System.out.println(s.equalsIgnoreCase("hello"));//true

			// toLowerCase() and toUpperCase()
			System.out.println(str.toLowerCase());//welcome
			System.out.println(str.toUpperCase());//WELCOME

			// substring()
			String subs = "Learning is fun";//index starts from 0
			System.out.println(subs.substring(4, 8));//ning becacuse 4 is inclusive but 8 is exclusive 
			System.out.println(subs.substring(4));// ning is fun becase from 4 to end of the string

			// charAt()
			System.out.println(subs.charAt(10));//s 

			// contains()
			System.out.println(subs.contains("is"));//true

			// replace()
			System.out.println(subs.replace('i', 'k'));//learnkng ks fun
			// replace all the 'i' with 'k'
		}

	}


