//Program to implement a calculator which takes two numbers and a character as operator and prints result (Switch)
import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two operands: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operator(+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Undefined");
                }
                break;
            case '%':
                if(num2 != 0){
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                } else{
                    System.out.println("Undefined");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}