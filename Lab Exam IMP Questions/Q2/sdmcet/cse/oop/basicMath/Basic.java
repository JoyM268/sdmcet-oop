/* Using the concept of packages, implement the following scenario:
Create a package named “basicMath” inside “sdmcet.cse.oop” package.
It has a class named Basic and provides following methods: 
i) Checks if a number is prime or not 
ii) Finds sum of digits of a number Create another package called “advancedMath” inside “sdmcet.cse.oop” package. 
It has a class named Advanced and provides following methods: 
i) Calculates sine, cosine & tan of a degree 
ii) Finds the sum of primary diagonal elements of a 3X3 matrix Create a class named MathTestDemo defined inside “sdmcet.cse.oop” package.
This class has main() method and must invoke all the methods of Basic and Advanced classes. */
package sdmcet.cse.oop.basicMath;

public class Basic {
    public boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int sumDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}