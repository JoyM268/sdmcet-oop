//Program to implement a calculator which takes two numbers and a character as operator and prints result using Switch with arrows
import java.util.Scanner;

class calculatorSwitchArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two operands: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operator(+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        String result = switch(op) {
            case '+' -> num1 + " + " + num2 + " = " + (num1 + num2);
            case '-' -> num1 + " - " + num2 + " = " + (num1 - num2);
            case '*' -> num1 + " * " + num2 + " = " + (num1 * num2);
            case '/' -> (num2 != 0)? num1 + " / " + num2 + " = " + (num1 / num2) : "undefined";
            case '%' -> (num2 != 0)? num1 + " % " + num2 + " = " + (num1 % num2) : "undefined";
            default -> "Invalid operator";
        };
        System.out.println(result);
        sc.close();
    }
}