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

    void insert(int element){
        if(rear == maxSize - 1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = element;
    }

    int delete(){
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

    public String toString(){
        if(front > rear){
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = front; i < rear; i++){
            str.append(arr[i] + ", ");
        }
        str.append(arr[rear] + "]");
        return str.toString();
    }
}


class Q4 {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);    
        q.insert(4);
        q.insert(5);
        q.insert(6);
        System.out.println(q);
        System.out.println("Popped element: " + q.delete());
        System.out.println(q);
    }
}