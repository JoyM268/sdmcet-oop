//program to create a matrix of order m x n and display it
import java.util.Scanner;

public class ReadPrintMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the order of the matrix: ");
        int row = in.nextInt(), col = in.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter " + (row * col) + " elements:");
        readElements(matrix);
        System.out.println("The contents of the matrix are:");
        printMatrix(matrix);
    }

    static void readElements(int[][] matrix){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}