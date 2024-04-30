//Functional interface in java
@FunctionalInterface
interface Abc{
    void show();
}

public class FuncInterface extends Thread{
    public static void main(String[] args) {
        Abc obj = () -> System.out.println("Hello World!");
        obj.show();
    }
}