//Program to sort a array using bubble sort
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 6, 9, 1, 3}; //Contents of the array before sorting
        System.out.println("Before sorting\n" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Before sorting\n" + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
