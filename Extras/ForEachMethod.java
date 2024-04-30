//Program to demonstrate the use of forEach method
import java.util.Arrays;
import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.forEach(n -> System.out.println(n));
    }
}