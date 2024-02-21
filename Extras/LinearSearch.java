//Program to perform linear search on a array of integers
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the key element: ");
        int key = in.nextInt();
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("Element " + key + " not found");
        } else{
            System.out.println("Element " + key + " found at index " + index);
        }        
    }

    static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
} 