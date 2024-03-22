import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            arr[k++] = arr1[i++];
        }

        while(j < arr2.length){
            arr[k++] = arr2[j++];
        }
    }

    static void mergeSort(int[] arr){
        if(arr.length == 1){
            return;
        }
        int m = arr.length/2;
        int n = arr.length - m;
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        int i = 0, j = 0, k = 0;
        while(i < m){
            arr1[i++] = arr[k++];
        }
        while(j < n){
            arr2[j++] = arr[k++];
        } 
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr, arr1, arr2);
    }
    
    public static void main(String[] args) {
        int[] arr = {45, 23, 89, 65, 10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
