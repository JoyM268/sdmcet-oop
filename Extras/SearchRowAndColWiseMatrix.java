//Program to search a element in a row wise and column wise sorted matrix
import java.util.Arrays;

public class SearchRowAndColWiseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        }; //Row and Column wise sorted matrix
        int target = 38; //Element to be searched
        int[] index = binarySearch(matrix, target);
        if(index[0] == -1){
            System.out.println("Element " + target + " not found");
        } else{
            System.out.println("Element " + target + " found at indices " + Arrays.toString(index));
        }
    }

    static int[] binarySearch(int[][] matrix, int target){
        int row = 0, col = matrix[row].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }else if(target < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
} 