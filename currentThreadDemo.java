//Progarm to demonstrate the use of currentThread() and setName() methods
class currentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        //Change the name of the Thread
        t.setName("My Thread");
        System.out.println("After name change: " + t + "\n");

        Thread t1 = new Thread();
        System.out.println("Child thread: " +  t1);
        t1.setName("Child1");
        //After name change
        System.out.println("Child thread: " +  t1);
    }    
}