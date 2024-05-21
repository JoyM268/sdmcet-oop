//Implement generic interface
interface comparing<T extends Comparable<T>>{
    T max(T obj1, T obj2);
    T min(T obj1, T obj2);
}

class minmax<T extends Comparable<T>> implements comparing<T>{
    public T max(T obj1, T obj2){
        if(obj1.compareTo(obj2) > 0){
            return obj1;
        }else{
            return obj2;
        }
    }

    public T min(T obj1, T obj2){
        if(obj1.compareTo(obj2) < 0){
            return obj1;
        }else{
            return obj2;
        }
    }
}

class genericInterface {
    public static void main(String[] args) {
        minmax<Integer> m1 = new minmax<>();
        System.out.println("Max: " + m1.max(4, 2));
        System.out.println("Min: " + m1.min(4, 2));
    }
}
