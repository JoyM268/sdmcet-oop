//Program to print half pyramid pattern for n rows using recursion
import java.util.Scanner;

public class HalfPyramidPatternRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printHalfPyramid(rows);
        sc.close();
    }

    static void printHalfPyramid(int rows){
        if(rows == 0){
            return;
        }
        printHalfPyramid(rows - 1);
        for(int i = 1; i <= rows; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}