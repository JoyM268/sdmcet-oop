//Program to find the largest of three numbers
import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("The largest number is " + max);
        in.close();
    }
}