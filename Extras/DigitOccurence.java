//Program to count the number of times a digit occurs in a given number
import java.util.Scanner;

public class DigitOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Enter the digit: ");
        int digit = in.nextInt();
        int count = 0;
        while(num > 0){
            if((num % 10) == digit){
                count++;
            }
            num /= 10;
        }
        System.out.println(digit + " occurs " + count + " times in the number");
        in.close();
    }
}
