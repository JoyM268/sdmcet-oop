//Program to store elements in Array List and display it
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPrintArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter 1 to add element or 0 to exit: ");
            int choice = in.nextInt();
            if(choice == 0) break;
            System.out.print("Enter the element: ");
            list.add(in.nextInt());
        }
        System.out.println("The contents to the Array list are:");
        System.out.println(list); 
    }
}
