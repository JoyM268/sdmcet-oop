//Program to search a element in a sorted array using binary search
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in sorted order:");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = in.nextInt();
        int index = binarySearch(arr, target);
        if(index != -1){
            System.out.println("Element " + target + " found at index " + index);
        } else{
            System.out.println("Element " + target + " not found");
        }
    }

    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}