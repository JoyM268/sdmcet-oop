/* Write a Java program that uses connection-oriented sockets and provides multi-way communication between client and server as shown below:
Server: Prompts client to enter a string 
Client: <provides a string> 
Server: Reverses the string and displays the reversed string and length of the string */
//Server Program
import java.net.*;
import java.io.*;

class Q8Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6000);
            System.out.println("Waiting for client...");
            Socket s = ss.accept();
            System.out.println("Connected to client");
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("Enter a string:");
            String msg = (String)din.readUTF();
            String reverse = new StringBuilder(msg).reverse().toString();
            System.out.println("The reverse of the string is: " + reverse);
            System.out.println("The length of the string is: " + msg.length());
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}