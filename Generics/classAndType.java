//Java program to show working of user defined Generic classes

//We use <> to specify Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

class classAndType {
    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
        System.out.println(iObj.getClass());

        // instance of String type
        Test<String> sObj = new Test<String>("CSE SDMCET");
        System.out.println(sObj.getObject());
        System.out.println(sObj.getClass().getName());
    }
}