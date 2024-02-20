//Program to implement calculator to perform basic operations +, -, x, / using enhaced switch
import java.util.Scanner;

public class CalculatorSwitch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operand 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the operator(+, -, x, /): ");
        char op = in.next().trim().charAt(0);
        System.out.print("Enter the operand 2: ");
        int num2 = in.nextInt();
        String result = switch(op) {
            case '+' -> num1 + " + " + num2 + " = " + (num1 + num2);
            case '-' -> num1 + " - " + num2 + " = " + (num1 - num2);
            case 'x' -> num1 + " x " + num2 + " = " + (num1 * num2);
            case '/' -> (num2 != 0)? num1 + " / " + num2 + " = " + (num1 / num2) : "undefined";
            default -> "Invalid operator";
        };
        System.out.println(result);
        in.close();
    }
}
