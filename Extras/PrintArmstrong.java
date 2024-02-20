//Program to print all three digits armstrong number
import java.lang.Math;

public class PrintArmstrong {
    public static void main(String[] args) {
        System.out.print("The 3 digit armstrong numbers are: ");
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean isArmstrong(int n){ 
        int org = n;
        int res = 0;
        while(n > 0){
            res += Math.pow(n % 10, 3);
            n /= 10;
        }
        return org == res;
    }
}