/* Program to check if the given string is a palindrome or not */

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder s1 = new StringBuilder(str);
        //StringBuffer s2 = new StringBuffer(str);
        if(str.equals(s1.reverse().toString())){
            System.out.println("String " + str + " is a palindrome");
        } else {
            System.out.println("String " + str + " is not a palindrome");
        }
    }
}
