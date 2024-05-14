//Program to demonstrate creation of anonymous thread
class anonymousThreadEx {
    public static void main(String args[]) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("task one");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("task two");
            }
        };

        t1.start();
        t2.start();
    }
}