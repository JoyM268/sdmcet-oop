//Program to insert n elements into a array and then display it
import java.util.Scanner;

public class ReadPrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        readArray(arr, n);
        System.out.print("The contents of the array are: ");
        printArray(arr, n);
    }   
    
    static void readArray(int[] arr, int n){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();    
        }
    }

    static void printArray(int[] arr, int n){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}