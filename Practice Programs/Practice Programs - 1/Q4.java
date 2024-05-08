//Write a Java program that implements a queue
class queue{
    private int front;
    private int rear;
    private int[] arr;
    final static int  DEFAULT_SIZE = 10;
    private int maxSize;

    queue(){
        maxSize = DEFAULT_SIZE;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
    }

    queue(int size){
        maxSize = size;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
    }

    void enqueue(int element){
        if(rear == maxSize - 1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = element;
    }

    int dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[front++];
        if(front > rear){
            front = 0;
            rear = -1;
        }
        return element;
    }
}

class Q4 {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("The dequeued element is: " + q.dequeue());
        System.out.println("The dequeued element is: " + q.dequeue());
        q.enqueue(5);
        System.out.println("The dequeued element is: " + q.dequeue());
    }
}