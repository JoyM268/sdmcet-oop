//Write a Java program that implements a stack
class stack{
    int[] stk;
    int size;
    int top;
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
            throw new IllegalStateException("Stack Overflow");
        }
        stk[++top] = element;
    }

    int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack Underflow");
        }
        return stk[top--];
    }

    public String toString(){
        if(top == -1){
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i < top; i++){
            str.append(stk[i] + ", ");
        }
        str.append(stk[top] + "]");
        return str.toString();
    }
}

class Q3 {
    public static void main(String[] args){
        stack s = new stack(10);    
        s.push(15);
        s.push(18);
        s.push(20);
        System.out.println(s + "\n");
        System.out.println("Element popped: " + s.pop());
        System.out.println(s);
    }
}