//Write a java program that implements the following builtin string functions
//Lenght of the string
//Checking equality of two strings
//Find substring of a given string
//Conversion of cases 
//Checking equality of 2 strings with ignore case
//Triming a given string
//Concatenating two strings
//Find index of given character
import java.util.Scanner;

public class builtInFunctions {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		//Direct assigning
		String s1 = "Hello";
		
		//Through char array
		char[] c = {'J', 'A', 'V', 'A'};
		String s2 = new String(c);
		
		//Through input string
		//String s3 = sc.next();
		
		System.out.println("Length of " + s1 + " = " + s1.length());
		
		String s4 = s1;
		System.out.println("Equality of s1 and s2 = " + s1.equals(s2));
		
		s4 = s1.toUpperCase();
		System.out.println("Equality of s1 and s4(ignoring case) = " + s1.equalsIgnoreCase(s4));

		System.out.println("Combined s1 and s2: " + s1.concat(" ").concat(s2));
		
		System.out.println("Index of e in " +  s1 + " is = " + s1.indexOf('e'));
		                
		String s5 =  " Java World        ";
		System.out.println(s5 + "\nAfter triming\n" + s5.trim());
		
		System.out.println("Substring from index 2 in " + s5 + "is: " + s5.substring(2));
		
		System.out.println("Substring from index 2 to 6 in " + s5 + "is: " + s5.substring(2, 6));

		System.out.println(s5 + " After split: ");
		char[] c1 = s5.split(" ");
		for(int i = 0; i < c1.length; i++){
			System.out.println(c1[i]);
		}

        //Note:
		//String valueOf(int) --> converts integer to string
		//String toString --> converts any object into string object
	}
}
