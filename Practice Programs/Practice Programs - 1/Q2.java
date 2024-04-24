/* Write a Java program that sorts the given array elements in ascending order(use any sorting technique of your choice). Use the following array elements:  
{98.87, 45.24, 39.71, 43.89, 10.09, 47.92, 47.84, 21.17, 38.51, 62.38, 71.39, 40.34, 28.54, 72.45, 59.31, 72.39, 87.34, 58.35, 71.21} */
import java.util.Arrays;

class sort{
    private void swap(double[] arr, int index1, int index2){
        double temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void bubbleSort(double[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        double[] arr = {98.87, 45.24, 39.71, 43.89, 10.09, 47.92, 47.84, 21.17, 38.51, 62.38, 71.39, 40.34, 28.54, 72.45, 59.31, 72.39, 87.34, 58.35, 71.21};
        System.out.println("Array before sorting:\n" + Arrays.toString(arr));
        sort s = new sort();
        s.bubbleSort(arr);
        System.out.println("Array after sorting:\n" + Arrays.toString(arr));
    }
}