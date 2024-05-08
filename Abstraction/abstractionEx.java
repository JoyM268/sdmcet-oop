/* Create a abstract class having a abstract method calculate, Create two other class A and B which extends the abstract class,
so that class A implements calculate method to perform addition and class B implements calculate method to perform multiplacation. */
abstract class abstraction {
    void display() {
        System.out.println("Hello...");
    }

    abstract int calculate(int a, int b);
}

class A extends abstraction {
    int calculate(int a, int b) {
        return (a + b);
    }
}

class B extends abstraction {
    int calculate(int a, int b) {
        return (a * b);
    }
}

class abstractionEx {
    public static void main(String[] args) {
        //We can't create an instance of abstract class
        //abstraction a1 = new abstraction();

        A a1 = new A();
        B b1 = new B();

        a1.display();
        System.out.println("Result for A = " + a1.calculate(10, 20));

        b1.display();
        System.out.println("Result for B = " + b1.calculate(20, 10));
    }
}