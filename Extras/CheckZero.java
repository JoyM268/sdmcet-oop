import java.util.Scanner;

public class CheckZero{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if(num > 0){
            System.out.println("The number " + num + " is positive");
        } else if(num < 0){
            System.out.println("The number " + num + " is negative");
        } else{
            System.out.println("The number is zero");
        }
        in.close();
    }
}