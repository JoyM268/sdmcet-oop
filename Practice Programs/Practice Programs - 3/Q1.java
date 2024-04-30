/*Write a Java program that displays the default name and priority of main thread.
Change the name to, My First Thread and priority to 3. Display the modified properties to the console. */
class Q1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("Name of main Thread: " + t1.getName());
        System.out.println("Priority of main Thread: " + t1.getPriority());
        t1.setName("My First Thread");
        t1.setPriority(3);
        System.out.println("After modifying properties of main thread are:\n" + t1);        
    }
}
