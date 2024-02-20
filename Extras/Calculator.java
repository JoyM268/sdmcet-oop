//Program to implement calculator to perform basic operations +, -, x, /
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operand 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the operator(+, -, x, /): ");
        char op = in.next().trim().charAt(0);
        System.out.print("Enter the operand 2: ");
        int num2 = in.nextInt();
        if(op == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if(op == '-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if(op == 'x'){
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if(op == '/'){
            if(num2 != 0){
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else{
                System.out.println("Undefined");
            }
        } else{
            System.out.println("Invalid operator");
        }
        in.close();
    }    
}