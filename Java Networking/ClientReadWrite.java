//Client sends "Hello server" to server and server sends "Hello client" then client reads and prints it on the console.
//Client program
import java.io.*;
import java.net.*;

class ClientReadWrite {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 5000);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
            dout.writeUTF("Hello Server");
            String msg = din.readUTF();
            System.out.println("The message from the server is: " + msg);
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}