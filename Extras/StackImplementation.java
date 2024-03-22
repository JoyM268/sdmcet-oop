import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StackImplementation <T>{
    private ArrayList<T> list = new ArrayList<>();
    
    public void push(T obj){
        list.add(obj);
    }

    public int size(){
        return list.size();
    }

    public T pop(){
        if(this.size() == 0){
            throw new NoSuchElementException();
        }
        return list.removeLast(); 
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        } else if(!(obj instanceof StackImplementation)){
            return false;
        } else if(this.size() != ((StackImplementation)obj).size()){
            return false;
        } else{
            for(int i = 0; i < this.size(); i++){
                if(this.list.get(i) != ((StackImplementation)obj).list.get(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public String toString(){
        if(this.size() == 0){
            return "Stack is empty";
        }
        return list.toString();
    }
}