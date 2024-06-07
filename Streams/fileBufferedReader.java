//Program to read contents of file using BufferedReader()
import java.io.BufferedReader;
import java.io.FileReader;

public class fileBufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
 
        String str = "";
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}