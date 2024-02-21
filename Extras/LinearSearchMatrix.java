//Program to perform linear search on a matrix
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchMatrix {
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
        System.out.print("Enter the target element: ");
        int target = in.nextInt();
        int[] ans = linearSearch(matrix, target);
        if(ans[0] == -1){
            System.out.println("Element " + target + " not found");
        } else{
            System.out.println("Element " + target + " found at indices " + Arrays.toString(ans));
        }
    }    

    static int[] linearSearch(int[][] matrix, int target){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
