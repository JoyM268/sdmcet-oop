//Program to print nth fibonacci number
import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt(); 
        int prev = 0, cur = 1;
        for(int i = 2; i <= n; i++){
            int temp = cur;
            cur += prev;
            prev = temp;
        }
        if(n == 0) cur = 0;
        System.out.println("The "+ n + "th value in fibonacci sequence is: " + cur);
        in.close();
    }
}