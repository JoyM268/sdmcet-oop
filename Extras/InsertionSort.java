//Program to sort a array using insertion sort
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 6, 9, 1, 3}; //Contents of the array before sorting
        System.out.println("Before sorting\n" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting\n" + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}