//Write a java program to read the contents from a file named "input.txt" nd write all the contents int a file named "output.txt"
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class CopyFileContents {    
    public static void main(String[] args) {
        try {
            //File f1 = new File("input.txt");
            //File f2 = new File("output.txt");

            FileReader in = new FileReader("input.txt");
            FileWriter out = new FileWriter("output.txt");
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}