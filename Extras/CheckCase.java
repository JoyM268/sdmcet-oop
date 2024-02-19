//Program to check if the given alphabet is in lowercase or uppercase
import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The alphabet " + ch + " is in lowercase.");
        }else{
            System.out.println("The alphabet " + ch + " is in uppercase.");
            in.close();  
        }
    } 
}
