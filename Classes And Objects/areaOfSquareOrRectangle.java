/* Create a java class name shape that has two different properties length and breadth and possess two different functionalities area and shapeName, 
Considering this class extend the main class to showcase the working of two different shapes decided based on king of values supplied. */
import java.util.Scanner;

class shapes{
    int l;
    int b;

    shapes(int l){
        this.l = this.b = l;
    }

    shapes(int l, int b){
        this.l = l;
        this.b = b;
    }

    void shapeName(String s){
        System.out.println("Shape is " + s);
    }

    int area(){
        return  (this.l * this.b);
    }
}

public class areaOfSquareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length = ");
        int l = sc.nextInt();
        System.out.print("Enter breadth = ");
        int b = sc.nextInt();
        if(l == b){
            shapes s1 = new shapes(l);
            s1.shapeName("square");
            System.out.println("Area of square = " + s1.area());
        } else{
            shapes s1 = new shapes(l, b);
            s1.shapeName("rectangle");
            System.out.println("Area of rectangle = " + s1.area());    
        }
    }
}