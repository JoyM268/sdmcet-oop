//Program to demonstrate use of various File methods 
import java.io.File;

public class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("input.txt");
        File f2 = new File("output.txt");
        p("File name: " + f1.getName());
        p("File Abs Path: " + f1.getAbsolutePath());
        p("File Parent: " + f1.getParent());
        p("File last modified on: " + f1.lastModified());
        p("File size: " + f1.length() + " bytes");

        p("Second file details:  ");
        p("File name: " + f2.getName());
        p("File Abs Path: " + f2.getAbsolutePath());
        p("File Parent: " + f2.getParent());
        //f2.deleteOnExit();
    }
}