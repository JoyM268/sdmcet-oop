//Java program to implement various operations on arrays
import java.util.Scanner;

class operations {
    int a[]; //Declared instance variable

    operations(int[] arr) {
        a = new int[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
    }

    int arraySum() {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }

    int minElement() {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
}

public class arrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        operations op = new operations(arr);
        System.out.println("Sum of array elements = " + op.arraySum());
        System.out.println("Min element in array = " + op.minElement());
    }
}