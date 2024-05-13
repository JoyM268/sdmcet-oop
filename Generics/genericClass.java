//Create generic class that can accept any data type value as input and displays the value irrespective of its data type
class test1<T>{
    T v;
    test1(T v){
        this.v = v;
    }

    void print(){
        System.out.println(v);
        System.out.println(v.getClass().getName());
    }

}

class genericClass{
    public static void main(String[] args) {
        test1<Integer> t1 = new test1<Integer>(12);
        t1.print();        

        test1<String> t2 = new test1<String>("Hello");
        t2.print();
    }
}