//Program to print first n natural numbers using recursion
import java.util.Scanner;

public class NaturalNumbersRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printNaturals(n);
        sc.close(); 
    }

    static void printNaturals(int n){
        if(n == 0){
            return;
        }
        printNaturals(n - 1);
        System.out.print(n + " ");
    }
}
