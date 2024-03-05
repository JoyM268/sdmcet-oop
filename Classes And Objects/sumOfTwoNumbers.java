//Program to add two numbers
import java.util.Scanner;

class numbers{
    int num1;
    int num2;

    numbers(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int sum(){
        return this.num1 + this.num2;
    }
}

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        numbers n = new numbers(num1, num2);
        System.out.println("Sum of " + n.num1 + " and " + n.num2 + " is " + n.sum());
    }
}
