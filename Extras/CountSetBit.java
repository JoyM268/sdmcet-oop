//Program to count the number of set bits in a number
public class CountSetBit{
    public static void main(String[] args) {
        int num = 10; //Given number
        System.out.println("The number of set bits in number " + num + " is " + setBits(num));
    }

    static int setBits(int num){
        int count = 0;
        while(num > 0){
            num -= (num & -num);
            count++;
        }
        return count;
    }
}