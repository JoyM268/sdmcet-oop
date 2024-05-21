//Program to demonstrate file handling in java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;

public class fileHandling {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        int ch;
        while((ch = fr.read()) != -1 ){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}