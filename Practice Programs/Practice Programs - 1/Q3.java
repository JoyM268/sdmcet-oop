//Write a Java program that implements a stack
class stack{
    private int[] stk;
    private int size;
    private int top;
    final static int DEFAULT_SIZE = 50;

    stack(){
        this.stk = new int[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        this.top = -1;
    }

    stack(int size){
        this.size = size;
        this.stk = new int[size];
        this.top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == size - 1;
    }

    void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stk[++top] = element;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stk[top--];
    }
}

class Q3 {
    public static void main(String[] args){
        stack s = new stack(10);    
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Element popped: " + s.pop());
        System.out.println("Element popped: " + s.pop());
        s.push(4);
        System.out.println("Element popped: " + s.pop());
    }
}