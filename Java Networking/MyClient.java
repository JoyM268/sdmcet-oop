/* Write a java program to implement a simple client server application using connection oriented protocal.
A client sends hello message to the server ans exits, server inturn reads the message sent by client and prints on the console. */
//Client Program
import java.io.*;
import java.net.*;

class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6000);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("This is Client...");
            dout.writeUTF("Hello Server");
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}