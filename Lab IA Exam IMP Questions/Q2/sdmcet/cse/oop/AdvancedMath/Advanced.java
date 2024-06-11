/* Using the concept of packages, implement the following scenario:
Create a package named “basicMath” inside “sdmcet.cse.oop” package.
It has a class named Basic and provides following methods: 
i) Checks if a number is prime or not 
ii) Finds sum of digits of a number Create another package called “advancedMath” inside “sdmcet.cse.oop” package. 
It has a class named Advanced and provides following methods: 
i) Calculates sine, cosine & tan of a degree 
ii) Finds the sum of primary diagonal elements of a 3X3 matrix Create a class named MathTestDemo defined inside “sdmcet.cse.oop” package.
This class has main() method and must invoke all the methods of Basic and Advanced classes. */
package sdmcet.cse.oop.AdvancedMath;

public class Advanced {
    public void findTrig(double degree){
        double rad = Math.toRadians(degree);
        System.out.println("sine of " + degree + " deg is " + Math.sin(rad));
        System.out.println("cosine of " + degree + " deg is " + Math.cos(rad));
        System.out.println("tan of " + degree + " deg is " + Math.tan(rad));
    }

    public int sumPrimaryDiagonal(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
        }
        return sum;
    }
}
