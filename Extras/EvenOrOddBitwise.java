//Program to check if the the number is odd or even using bitwise operator

import java.util.Scanner;

public class EvenOrOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isOdd(num)){
            System.out.println(num + " is odd");
        } else{
            System.out.println(num + " is even");
        }
        sc.close();
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
