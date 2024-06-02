//Write a java program to read contents of the file named input.txt into another file output.txt only when the read character is vowel

import java.io.FileReader;
import java.io.FileWriter;

class CopyFileVowels {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("input.txt");
            FileWriter out = new FileWriter("output.txt");
            int c;
            while((c = in.read()) != -1){
                if('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c){
                    out.write(c);
                }
            }
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}