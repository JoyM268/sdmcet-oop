/* Write a java program to implement a simple client server application using connection oriented protocal.
A client sends hello message to the server ans exits, server inturn reads the message sent by client and prints on the console. */
//Server Program
import java.io.*;
import java.net.*;

class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6000);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            System.out.println("This is Server...");
            String msg = (String) din.readUTF();
            System.out.println("Message received: " + msg);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}