//Program to count the occurence of a given key element in the array 
import java.util.Scanner;

public class ElementOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        System.out.print("Enter the key element: ");
        int key = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        readElements(arr, n);
        int count = countOccurence(arr, n, key);
        System.out.println("The element " + key + " occurs " + count + " times in the array");
    }

    static void readElements(int[] arr, int n){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
    }

    static int countOccurence(int[] arr, int n, int key){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                count++;
            }
        }
        return count;
    }
}
