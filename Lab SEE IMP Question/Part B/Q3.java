/* Write a Java program that simulates client-server interaction using threads. Methodology: Two threads should be created; one thread should act as server,
and the other one should act as client. The server thread should accept a string from the client thread. Upon receiving and displaying the string, the server
thread should send back the acknowledgement message "Message Received" to the client thread. */

import java.util.Scanner;

class request{
    boolean msgSent = false;
    boolean ackSent = false;
    String msg;
    String ack;
    synchronized void sendMessage(String msg){
        while(msgSent){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        this.msg = msg;
        msgSent = true;
        notifyAll();
    }

    synchronized String receiveMessage(){
        while(!msgSent){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        msgSent = false;
        notifyAll();
        return this.msg;
    }

    synchronized void sendAck(String ack){
        while(ackSent){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        this.ack = ack;
        ackSent = true;
        notifyAll();
    }

    synchronized String receiveAck(){
        while(!ackSent){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        ackSent = false;
        notifyAll();
        return this.ack;
    }
}

class server extends Thread{
    request req;
    server(request req){
        this.req = req;
    }

    public void run(){
        while(true){
            String msg = req.receiveMessage();
            System.out.println("Server Received: " + msg);
            req.sendAck("Message Received");
        }
    }
}

class client extends Thread{
    request req;
    client(request req){
        this.req = req;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the String: ");
            String msg = sc.nextLine();
            req.sendMessage(msg);
            System.out.println("Client Received: " + req.receiveAck());     
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        request req = new request();
        new client(req).start();
        new server(req).start();
    }
}