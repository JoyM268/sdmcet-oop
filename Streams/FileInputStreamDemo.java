//Program to read files using FileInputStream
import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		int size;
		FileInputStream f = new FileInputStream("input.txt");
		size = f.available();
		System.out.println("Total bytes: " + size);
		int n = size / 4;
		System.out.println("First " + n + " bytes of the file are read at a time");

		for (int i = 0; i < n; i++) {
			System.out.print((char) f.read());
		}
		System.out.println("\nTotal bytes remaining: " + f.available());

		f.close();
	}

}
