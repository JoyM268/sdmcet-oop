//Program to print prime numbers between 1 to n using sieve of eratosthenes
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        printPrimes(n);
        in.close();
    }

    static void printPrimes(int n){
        boolean[] nums = new boolean[n + 1];
        Arrays.fill(nums, true);
        nums[0] = nums[1] = false; 
        for(int i = 0; i <= n; i++){
            if(nums[i]){
                for(int j = i * i; j <= n; j = j + i){
                    nums[j] = false;
                }
            }
        }
        for(int i =  0; i <= n; i++){
            if(nums[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}