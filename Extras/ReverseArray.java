//Program to reverse a array
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The elements of array before reverse is:");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("The elements of array after reverse is:");
        System.out.println(Arrays.toString(arr));
    }  


    static void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}