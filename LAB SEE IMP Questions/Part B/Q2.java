/* Write a Java program that creates three threads. The first thread prints prime numbers from 1 to 100; second thread prints prime numbers from 101 to 200 
and third thread prints prime numbers from 201 to 300. Note: The three threads must call the same method generatePrime() to print the prime numbers. */
class primeNumber extends Thread {
    int start;
    int end;

    primeNumber(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void generatePrime() {
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

    public void run() {
        generatePrime();
    }
}

public class Q2 {
    public static void main(String[] args) {
        primeNumber t1 = new primeNumber(1, 100);
        primeNumber t2 = new primeNumber(101, 200);
        primeNumber t3 = new primeNumber(201, 300);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}