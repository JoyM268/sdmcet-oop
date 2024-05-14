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

public class Q5 {
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
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}