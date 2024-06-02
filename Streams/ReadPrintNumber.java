//Write a java program to read a number and print it on the screen without using the scanner class
import java.io.*;
class ReadPrintNumber{
    public static void main(String[] args) {
        BufferedInputStream in = new BufferedInputStream(System.in);
        //BufferedOutputStream out = new BufferedOutputStream(System.out);
        try {
            System.out.print("Enter a number: ");
            int c = in.read();
            //out.write(c);
            //out.flush();
            System.out.println("The number is: " + (char)c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}