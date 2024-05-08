import java.util.Scanner;

class arrayOp {
    int sum(int iArr[]) {
        int s = 0;
        for (int i = 0; i < iArr.length; i++) {
            s += iArr[i];
        }
        return s;
    }
}

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr:");
        int size = sc.nextInt();

        int elements[] = new int[10];
        System.out.println("Enter arr elements:");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        arrayOp a1 = new arrayOp();

        System.out.println("Sum of arr elements = " + a1.sum(elements));
    }
}