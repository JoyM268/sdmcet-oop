/* Write a Java program that uses connection-oriented sockets and provides multi-way communication between client and server as shown below:
Server: Prompts client to enter a string 
Client: <provides a string> 
Server: Reverses the string and displays the reversed string and length of the string */
//Server Program
import java.net.*;
import java.io.*;

class Q16Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6000);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("Enter a string:");
            String msg = (String)din.readUTF();
            String reverse = new StringBuilder(msg).reverse().toString();
            dout.writeUTF(reverse);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}