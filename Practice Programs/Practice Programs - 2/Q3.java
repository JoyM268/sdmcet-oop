/* Write a Java program that implements a simple calculator. The inputs are to be read from the keyboard. 
[Hint: Use Scanner class object to read the input from keyboard] */ 
import java.util.Scanner;

class SimpleCalculator{
    int a, b;

    SimpleCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    void sum(){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void difference(){
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    void product(){
        System.out.println(a + " * " + b + " = " + (a * b)); 
    }

    void quotient(){
        if(b == 0){
            throw new ArithmeticException("Divide by 0 not Allowed");
        }else{
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);
        SimpleCalculator cal = new SimpleCalculator(num1, num2);
        switch(op){
            case '+': 
                cal.sum();
                break;
            case '-':
                cal.difference();
                break;
            case '*': 
                cal.product();
                break;
            case '/':
                cal.quotient();
                break;
            default:
                throw new IllegalArgumentException("Invalid Operator");
        }
    }
}