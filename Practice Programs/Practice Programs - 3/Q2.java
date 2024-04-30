/* Write a Java program that creates three threads named One, Two and Three.
Each threads display numbers from 1 to 5 at intervals of 0.5 second.
The program must ensure that main thread always waits for all of its child threads to finish their execution. */
class numberThread extends Thread{

    numberThread(String name){
        super(name);
    }

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class Q2 {
    public static void main(String[] args) {
        numberThread t1 = new numberThread("One");
        numberThread t2 = new numberThread("Two");
        numberThread t3 = new numberThread("Three");
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        t3.start();
    }
}
