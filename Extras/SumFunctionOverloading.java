//Write sum function to add 2 or 3 operands using function overloading 
import java.util.Scanner;

public class SumFunctionOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of operands(2, 3): ");
        int n = sc.nextInt();
        if (n == 2){
            System.out.print("Enter the 2 operands: ");
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            sum(num1, num2);
        } else if (n == 3){
            System.out.print("Enter the 3 operands: ");
            int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
            sum(num1, num2, num3);
        } else{
            System.out.println("Invalid number of operands");
        }
        sc.close();
    }

    static void sum(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static void sum(int a, int b, int c){
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }
}