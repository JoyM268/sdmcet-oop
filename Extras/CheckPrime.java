//Program to check whether the given number is prime or not
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }

    static boolean isPrime(int n){
        if(n <= 1) return false;
        int i = 2;
        while(i * i <= n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
