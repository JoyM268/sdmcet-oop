//Program to find the ith bit of a given number
public class findIthBit {
    public static void main(String[] args) {
        int num = 5; //Given number
        int i = 1; //Position of the bit from right to left
        System.out.println("The " + i + "th bit of the number " + num + " is " + iBit(num, i));
    }

    static int iBit(int num, int i){
        return (num >> i - 1 & 1);
    }
}

