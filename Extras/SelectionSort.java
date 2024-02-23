//Program to sort a array using selection sort
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 6, 9, 1, 3}; //Contents of the array before sorting
        System.out.println("Before sorting\n" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting\n" + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(i != min){
                swap(arr, i, min);
            }
        }
    }
}
