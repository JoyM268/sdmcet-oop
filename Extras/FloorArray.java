//Program to find floor in a sorted array for a given target element
//Floor is the largest element in the array which is smaller than or equal to the target element

import java.util.Scanner;

public class FloorArray {
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
        int floorIndex = findFloor(arr, target);
        if(floorIndex == -1){
            System.out.println("Floor does not exist for target element " + target);
        } else{
            System.out.println("The Floor is " + arr[floorIndex] + " at index " + floorIndex);
        }
    }

    static int findFloor(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return end;
    }
}
