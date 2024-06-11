//Program to demonstrate lambda expression
//Functional interface.
interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String args[]) {
        MyNumber myNum; // declare an interface reference
        myNum = () -> 123.45;

        // Call getValue(), which is provided by the previously assigned lambda
        // expression.
        System.out.println("A fixed value: " + myNum.getValue());
        
        // Here, a more complex expression is used.
        myNum = () -> Math.random() * 100;
        
        // These call the lambda expression in the previous line.
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
        
        // A lambda expression must be compatible with the method defined by the functional interface.
        //Therefore, this won't work:
        // myNum = () -> "123.03"; // Error!
        /*
         * the lambda expression must be compatible with the abstract method that it is intended to implement.
         * For this reason, the commented-out line at the end of the preceding program
         * is illegal because a value of type String is not compatible with double,
         * which is the return type required by getValue( ).
         */
    }
}