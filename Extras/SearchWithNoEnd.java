//Program to search in a sorted array with no end index(infinite sorted array)
import java.util.Scanner;

public class SearchWithNoEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[1000000000];
        int i = 0;
        while(true){
            System.out.print("Enter 1 to add element or 0 to exit: ");
            int choice = in.nextInt();
            if(choice == 0) break;
            System.out.print("Enter the element: ");
            arr[i++] = in.nextInt();
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

    static int[] findStartAndEndIndex(int[] arr, int target){
        int start = 0, end = 1;
        while(arr[end] < target){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;        
        }
        return new int[]{start, end};
    } 

    static int binarySearch(int[] arr, int target){
        int[] index = findStartAndEndIndex(arr, target);
        int start = index[0], end = index[1];
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