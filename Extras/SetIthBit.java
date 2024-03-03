//Program to set ith bit of the given number
public class SetIthBit {
    public static void main(String[] args) {
        int num = 5; //Given number
        int i = 2; // Position of the bit from right to left
        System.out.println("The number after ith bit of " + num + " is set is " + setIBit(num, i));
    }

    static int setIBit(int num, int i){
        return num | (1 << i - 1);
    }
}
