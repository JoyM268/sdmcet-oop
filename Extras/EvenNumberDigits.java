//Program to find count numbers with even number of digits
import java.util.Scanner;

public class EvenNumberDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Count of numbers with even number of digits is " + countEvenNumberDigits(arr));
    }

    static int countEvenNumberDigits(int[] arr){
        int count = 0;
        for(int ele : arr){
            if(((int)Math.log10(ele) + 1) % 2 == 0){
                count++;
            } 
        }
        return count;
    }
}
