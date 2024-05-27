//Client sends "Hello server" to server and server sends "Hello client" then client reads and prints it on the console.
//Server program
import java.io.*;
import java.net.*;

public class ServerReadWrite {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String msg = din.readUTF();
            dout.writeUTF("Hello Client");
            System.out.println("The message from client is: " + msg);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}