//Program to print nth fibonacci number using recursion
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th fibonacci number is " + fib(n));   
        sc.close();
    }

    static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
