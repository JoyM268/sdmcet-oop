// With a example show how abstract class is used in code reusability and also in abstraction
abstract class shape {
    void print(){
        System.out.println("Geometric object");
    }
    abstract void draw();
}

class square extends shape{
    void draw(){
        System.out.println("Drawing a square");
    }
}

class rectangle extends shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}

class abstractClassEx{
    public static void main(String[] args) {
        shape s1;
        s1 = new square();
        s1.print();
        s1.draw();
        s1 = new rectangle();
        s1.print();
        s1.draw();
    }
}