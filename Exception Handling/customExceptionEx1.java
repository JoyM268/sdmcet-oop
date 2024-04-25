/* Write a java program to do the following using the concepts of classes and objects, exceptions, etc.
i] Read any three integers and one string in such a way that the 3 integers are inputed through the keyboard, after the prompt for the number apppears,
string is read through command line arguements.

ii] If string is null then throw a exception stringCannotBeNull and division of first two numbers cannot have divisor zero, if so handle it by inbuilt
exception and atlast the sum of all three numbers is greater then 20 or less than 0 throw a custom exception outOfRange. */
import java.util.Scanner;

class stringCannotBeNull extends Exception{
    public String toString(){
        return "Given string is null and is not allowed";
    }
}

class outOfRange extends Exception{
    int sum;
    outOfRange(int sum){
        this.sum = sum;
    }

    public String toString(){
        return "Sum " + this.sum + " is out of range of 0 to 20";
    }
}

public class customExceptionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String s1 = args[0];
        //s1 = null;

        try{
            if(s1 == null){
                throw new stringCannotBeNull();
            }
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            if(b == 0){
                throw new ArithmeticException();
            }
            if((a + b + c) < 0 || (a + b + c) > 20){
                throw new outOfRange(a + b + c);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}