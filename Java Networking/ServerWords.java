/* Create a java client server application using connection oriented approach to perform the set of operation:
1) Server sends to the client a message "Enter a line of text".
2) Client enters one line of string and sends the string message to server.
3) Server responds with the total number of words contained in the line of string. */

//Server Program
import java.net.*;
import java.io.*; 

class ServerWords { 
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6000);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Enter a line of text:");
            String msg = (String)din.readUTF();
            int count = 1;
            for(int i = 0; i < msg.length(); i++){
                if(msg.charAt(i) == ' '){
                    count++;
                }
            }
            dout.writeUTF(Integer.toString(count));
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}