/* Write a Java program that uses connection-oriented sockets and provides multi-way communication between client and server as shown below:
Server: Prompts client to enter a string 
Client: <provides a string> 
Server: Reverses the string and displays the reversed string and length of the string */
//Client Program
import java.util.Scanner;
import java.net.*;
import java.io.*;

class Q8Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("localhost", 6000);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            String msg = (String)din.readUTF();
            System.out.println(msg);
            String str = sc.nextLine();
            dout.writeUTF(str);
            sc.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}