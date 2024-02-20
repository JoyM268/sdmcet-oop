//Program to find the maximum element in the array
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is " + max);
        in.close();
    }
}
