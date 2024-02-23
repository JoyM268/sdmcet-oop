//Program to search a element in a completely sorted matrix

import java.util.Arrays;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; //Sorted matrix
        int target = 5; //Element to be searched
        int[] index = binarySearch(matrix, target);
        if(index[0] == -1){
            System.out.println("Element " + target + " not found");
        } else{
            System.out.println("Element " + target + " found at indices " + Arrays.toString(index));
        }
    }

    static int[] binarySearch(int[][] matrix, int target){
        int start = 0, end = matrix.length * matrix[0].length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            int value = matrix[row][col];
            if(target == value){
                return new int[]{row, col};
            } else if(target < value){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}