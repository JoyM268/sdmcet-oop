//Write a Java program that implements a simple calculator. The inputs are to be taken as command line arguments.

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

class Q2 {
    public static void main(String[] args) {
        if(args.length < 3){
            System.out.println("Enter the inputs as arguements");
            System.exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
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