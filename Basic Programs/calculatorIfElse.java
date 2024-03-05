//Program to implement a calculator which takes two numbers and a character as operator and prints result (using if else) 
import java.util.Scanner;

public class calculatorIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two operands: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operator(+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        if(op == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if(op == '-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if(op == '*'){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if(op == '/'){
            if(num2 != 0){
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else{
                System.out.println("Undefined");
            }
        } else if(op == '%'){
            if(num2 != 0){
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            } else{
                System.out.println("Undefined");
            }
        } else{
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
}