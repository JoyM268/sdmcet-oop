//Program to find maximum element in a matrix
import java.util.Scanner;

public class MaxElementMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        int m = in.nextInt(), n = in.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter " + (m * n) + " Elements:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int max = maxElement(matrix);
        System.out.println("The maximum element in the matrix is: " + max);
    }

    static int maxElement(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int[] arr : matrix){
            for(int element : arr){
                if(max < element){
                    max = element;
                }
            }
        }
        return max;
    }
}