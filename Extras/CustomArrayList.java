//Program to implement a Array List

public class CustomArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public CustomArrayList(int initialSize){
        if(initialSize <= 0){
            this.data = new Object[CustomArrayList.DEFAULT_SIZE];
        } else {
            this.data = new Object[initialSize];
        }
    }

    public void add(T obj){
        if(this.isFull()){
            this.resize();
        }
        this.data[size++] = obj;
    }

    private boolean isFull(){
        return (this.size == data.length);
    }

    public int size(){
        return this.size;
    }

    private void resize(){
        Object[] temp = new Object[2 * size];
        for(int i = 0; i < size; i++){
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public T remove(){
        T temp =  (T)(this.data[--size]);
        return temp;
    }

    public T get(int index){
        return (T)(this.data[index]);
    }

    public String toString(){
        if(this.size == 0){
            return new String("[]");
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i < this.size; i++){
            str.append(this.data[i].toString());
            if(i != this.size - 1){
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

    public void set(T obj, int index){
        if(index < this.size){
            this.data[index] = obj;
        }
    }
}