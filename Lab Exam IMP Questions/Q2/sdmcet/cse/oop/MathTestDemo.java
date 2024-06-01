/* Using the concept of packages, implement the following scenario:
Create a package named “basicMath” inside “sdmcet.cse.oop” package.
It has a class named Basic and provides following methods: 
i) Checks if a number is prime or not 
ii) Finds sum of digits of a number Create another package called “advancedMath” inside “sdmcet.cse.oop” package. 
It has a class named Advanced and provides following methods: 
i) Calculates sine, cosine & tan of a degree 
ii) Finds the sum of primary diagonal elements of a 3X3 matrix 
Create a class named MathTestDemo defined inside “sdmcet.cse.oop” package.
This class has main() method and must invoke all the methods of Basic and Advanced classes. */
package sdmcet.cse.oop;
import java.util.Scanner;
import sdmcet.cse.oop.BasicMath.*;
import sdmcet.cse.oop.AdvancedMath.*;

public class MathTestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Basic Math\n2.Advanced Math");
        System.out.print("Enter the choice(1, 2): ");
        int choice = sc.nextInt();
        int option;
        switch(choice){
            case 1:
                Basic b = new Basic();
                System.out.println("\n1.Check prime\n2.Sum digits");
                System.out.print("Enter the option: ");
                option = sc.nextInt();
                int num;
                switch(option){
                    case 1:
                        System.out.print("Enter the number: ");
                        num = sc.nextInt();
                        if(b.isPrime(num)){
                            System.out.println(num + " is a prime number");
                        }else{
                            System.out.println(num + " is not a prime number");
                        }
                        break;
                    case 2:
                        System.out.print("Enter the number: ");
                        num = sc.nextInt();
                        System.out.println("The sum of digits of " + num + " is " + b.sumDigits(num));
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;

            case 2:
                Advanced a = new Advanced();
                System.out.println("\n1.Calculate sine, cosine, tan\n2.Sum primary diagonal");
                System.out.print("Enter the option: ");
                option = sc.nextInt();
                switch(option){
                    case 1:
                        System.out.print("Enter the degree: ");
                        double deg = sc.nextDouble();
                        a.findTrig(deg);
                        break;
                    case 2:
                        int[][] matrix = new int[3][3];
                        System.out.println("Enter the elements of 3X3 matrix: ");
                        for(int i = 0; i < 3; i++){
                            for(int j = 0; j < 3; j++){
                                matrix[i][j] = sc.nextInt();
                            }
                        }
                        System.out.println("Sum of diagonal elements in the 3X3 matrix is: " + a.sumPrimaryDiagonal(matrix));
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }    
}