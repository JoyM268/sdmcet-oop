/* Write a java client server application that thus the following:
Server sends to the client "Enter an positive integer:"
Client responds this by sending a positive integer.
Server replies with its square and value received is printed on console output. */
//Client Program
import java.net.*;
import java.util.Scanner;
import java.io.*;

class ClientSquare {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("localhost", 5000);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String msg1 = din.readUTF();
            System.out.println(msg1 + ":");
            int num = sc.nextInt();
            dout.writeUTF(Integer.toString(num));
            String msg2 = din.readUTF();
            System.out.println("The square of the given number is: " + msg2);
            s.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}