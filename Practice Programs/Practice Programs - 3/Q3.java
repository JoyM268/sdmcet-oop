/* Using threads, write a Java  Program that implements a simple calculator.
Create  separate threads that perform addition, subtraction, multiplication and division operations */

import java.util.Scanner;

class additionThread extends Thread{
    int num1;
    int num2;
    additionThread(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run(){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

class subtractionThread extends Thread{
    int num1;
    int num2;
    subtractionThread(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run(){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
}

class multiplicationThread extends Thread{
    int num1;
    int num2;
    multiplicationThread(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run(){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
}

class divisionThread extends Thread{
    int num1;
    int num2;
    divisionThread(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run(){
        try{
            if(num2 == 0){
                throw new ArithmeticException("/ by 0");
            }else{
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }
    }
}

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operand 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the operand 2: ");
        int num2 = sc.nextInt();
        switch(op){
            case '+':
                additionThread t1 = new additionThread(num1, num2);
                t1.start();
                break;
            case '-':
                subtractionThread t2 = new subtractionThread(num1, num2);
                t2.start();
                break;
            case '*':
                multiplicationThread t3 = new multiplicationThread(num1, num2);
                t3.start();
                break;
            case '/':
                divisionThread t4 = new divisionThread(num1, num2);
                t4.start();
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}