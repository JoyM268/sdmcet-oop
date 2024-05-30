/* Write a Java program that uses threads to compute multiplication of two matrices. The program should perform multiplication of matrices of arbitrary order.
Also, proper error handling mechanism should be used. Methodology: Matrix multiplication is implemented using the formula: Cij = Aik * Bkj.
This formula is used for generating each element of the final matrix. The multiplication must be performed by separate threads.
Ex: If order of final matrix is 3X3, then total of 9 threads should be created; each thread computing individual elements of the final matrix. */
import java.util.Scanner;

class matrixMultiplacationNotPossible extends Exception{
    @Override
    public String toString() {
        return "Matrix multiplication not possible";    
    }
}

class matrixMultiplyThread extends Thread{
    int[][] matrix1;
    int[][] matrix2;
    int[][] ansMatrix;
    int i;
    int j;
    matrixMultiplyThread(int[][] matrix1, int[][] matrix2, int[][] ansMatrix, int i, int j){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.ansMatrix = ansMatrix;
        this.i = i;
        this.j = j;
    }   
    
    public void run(){
        for(int k = 0; k < matrix2.length; k++){
            ansMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        }
    }
}

class Q5{

    static void readMatrix(int[][] matrix){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix 1: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println("Enter the order of matrix 2: ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        try{
            if(n != p){
                throw new matrixMultiplacationNotPossible();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[p][q];
        int[][] ansMatrix = new int[m][q]; 

        System.out.println("Enter " + (m * n) + " elements of matrix 1: ");
        readMatrix(matrix1);
        System.out.println("Enter " + (p * q) + " elements of matrix 2: ");
        readMatrix(matrix2);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < q; j++){
                matrixMultiplyThread t = new matrixMultiplyThread(matrix1, matrix2, ansMatrix, i, j);
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        //System.out.println(Arrays.deepToString(ansMatrix)); //This method prints the matrix
        System.out.println("The resultant array is:");
        for(int[] arr : ansMatrix){
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}