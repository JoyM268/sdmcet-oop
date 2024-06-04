/* Write a Java program that uses streams to copy the contents of one file into another. The program must take the file names from command-line arguments 
and perform error handling if the entered file is invalid or file cannot be opened. */
import java.io.*;

class Q17{
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Enter two file names as command-line arguments");
            System.exit(0);
        }
        try {
            FileReader fr = new FileReader(args[0]); 
            FileWriter fw = new FileWriter(args[1]);
            int ch;
            while((ch = fr.read()) != -1){
                fw.write(ch);
            }
            System.out.println("The contents of file " + args[0] + " was copied into file " + args[1]);
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("File not found or file cannot be opened");
        }      
    }
}