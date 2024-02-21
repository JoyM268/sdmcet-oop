//Program to find the maximum row sum in a given matrix
import java.util.Scanner;

public class MaxRowSum {
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
        System.out.println("The maximum row sum is " + maxSum(matrix));
    }    

    static int maxSum(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int[] arr : matrix){
            int sum = 0;
            for(int element : arr){
                sum += element;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
