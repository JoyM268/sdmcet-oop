//Program to search a character in a string
import java.util.Scanner;

public class SearchCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String str = in.nextLine();
        System.out.print("Enter the target character: ");
        char ch = in.next().trim().charAt(0);
        if(search(str, ch)){
            System.out.println("Character " + ch + " exists in the string " + str);
        } else{
            System.out.println("Character " + ch + " does not exist in the string " + str);
        }
    }
    
    private static boolean search(String str, char target){
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}