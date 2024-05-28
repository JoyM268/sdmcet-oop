/* Create a java client server application using connection oriented approach to perform the set of operation:
1) Server sends to the client a message "Enter a line of text".
2) Client enters one line of string and sends the string message to server.
3) Server responds with the total number of words contained in the line of string. */

//Client Program
import java.net.*;
import java.io.*; 
import java.util.Scanner;

class ClientWords {
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
            System.out.println("The number of words in string are: " + din.readUTF());
            s.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}