//Program to find ceiling in a sorted array for a given target element
//Ceiling is the smallest element in the array which is greater than or equal to the target element
import java.util.Scanner;

public class CeilArray {
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
        int ceilIndex = findCeil(arr, target);
        if(ceilIndex == -1){
            System.out.println("Ceil does not exist for target element " + target);
        } else{
            System.out.println("The Ceil is " + arr[ceilIndex] + " at index " + ceilIndex);
        }
    }

    static int findCeil(int[] arr, int target){
        if(target > arr[arr.length - 1]){
            return -1;
        }
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
        return start;
    }
}