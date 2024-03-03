//Program to reset ith bit of the given number
public class ResetIthBit {
    public static void main(String[] args) {
        int num = 5; //Given number
        int i = 1; // Position of the bit from right to left
        System.out.println("The number after ith bit of " + num + " is reset is " + resetIBit(num, i));
    }

    static int resetIBit(int num, int i){
        return num & ~(1 << i - 1);
    }
}
