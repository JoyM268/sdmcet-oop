/* Write a java program that uses thread to display odd and even numbers from 1 to 100.
The program should create two threads, each thread printing odd and even numbers.
The program must ensure that when one thread is printing numbers, the other thread must wait. */
class evenThread extends Thread{
    public void run(){
        for(int i = 2; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}

class oddThread extends Thread{
    public void run(){
        for(int i = 1; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}

class Q1_b{
    public static void main(String[] args) {
        evenThread t1 = new evenThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        oddThread t2 = new oddThread();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}