//Create a generic class that accepts two different data typed objects in a single call, display their values on the console window.
class test2<T, U>{
    T v1;
    U v2;
    test2(T v1, U v2){
        this.v1 = v1;
        this.v2 = v2;        
    }

    void print(){
        System.out.println(v1);
        System.out.println(v2);
    }

}

class twoObjectGeneric{
    public static void main(String[] args) {
        test2<Integer, String> t1 = new test2<Integer, String>(12, "SDMCET");
        t1.print();        

        test2<String, Double> t2 = new test2<String, Double>("Hello", 45.89);
        t2.print();
    }
}