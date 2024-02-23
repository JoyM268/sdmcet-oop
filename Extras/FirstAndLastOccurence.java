//Program to find the first and last occurence of a given target element in a sorted array
import java.util.Scanner;
import java.util.Arrays;

public class FirstAndLastOccurence {
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
        int[] ans = firstAndLastIndex(arr, target);
        if(ans[0] == -1){
            System.out.println("The element " + target + " does not exist in the array");
        } else{
            System.out.println("The first and last ocurrence of the element " + target + " is at indices " + Arrays.toString(ans));
        }
    }

    static int[] firstAndLastIndex(int[] arr, int target){
        int firstIndex = searchIndex(arr, target, true);
        if(firstIndex == -1){
            return new int[]{-1, -1};
        }
        int lastIndex = searchIndex(arr, target, false);
        return new int[]{firstIndex, lastIndex};       
    }

    static int searchIndex(int[] arr, int target, boolean first){
        int start = 0, end = arr.length - 1, ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                ans = mid;
                if(first){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans; 
    }
}