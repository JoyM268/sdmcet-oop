//Program to create a matrix of order m x n using array list
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>matrix = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        int m = in.nextInt(), n = in.nextInt();
        for(int i = 0; i < m; i++){
            matrix.add(new ArrayList<>());
        }
        System.out.println("Enter the " + (m * n) + " elements:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix.get(i).add(in.nextInt());
            }
        }
        System.out.println("The matrix is:");
        System.out.println(matrix);
    }
}
