/* Write a Java program that simulates client-server interaction using threads.  
Methodology: Two threads should be created; one thread should act as server, and the other one should act as client.
The server thread should accept request from client thread. Upon processing the request, the server thread should  
send back the acknowledgement message "Message Received" to client thread. */
class request{
    boolean sent = false;
    synchronized void sendMessage(){
        while(sent){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.println("Message Sent");
        sent = true;
        notify();
    }

    synchronized void receiveMessage(){
        while(!sent){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.println("Message Received");
        sent = false;
        notify();
    }
}

class server extends Thread{
    request req;
    server(request req){
        this.req = req;
    }

    public void run(){
        while(true){
            req.receiveMessage();
        }
    }
}

class client extends Thread{
    request req;
    client(request req){
        this.req = req;
    }

    public void run(){
        while(true) {
            req.sendMessage();
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        request req = new request();
        new client(req).start();
        new server(req).start();
    }
}