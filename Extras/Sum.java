//Program to add two given integers
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        input.close();
    }
}
