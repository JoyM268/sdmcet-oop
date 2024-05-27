/* Write a java client server application that thus the following:
Server sends to the client "Enter an positive integer:"
Client responds this by sending a positive integer.
Server replies with its square and value received is printed on console output. */
//Server Program
import java.net.*;
import java.io.*;

class ServerSquare{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
            dout.writeUTF("Enter an positive integer");
            int num = Integer.parseInt(din.readUTF());
            dout.writeUTF(Integer.toString(num * num));
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}