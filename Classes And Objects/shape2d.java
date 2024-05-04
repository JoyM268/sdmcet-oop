//Write a java program that showcases overloading of methods
import java.util.Scanner;

class shapeAreaPerimeter {
    int area(int l){
        return (l * l);
    }
    
    int area(int l, int b){
        return (l * b);
    }

    int perimeter(int l){
        return (4 * l);
    }

    int perimeter(int l, int b){
        return 2 * (l + b);
    }
}

class shape2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length = ");
        int l = sc.nextInt();
        System.out.print("Enter breadth = ");
        int b = sc.nextInt();
        shapeAreaPerimeter s1 = new shapeAreaPerimeter();
        if(l == b){
            System.out.println("Area of square = " + s1.area(l));
            System.out.println("Perimeter of square = " + s1.perimeter(l));
        } else{
            System.out.println("Area of rectangle = " + s1.area(l, b));
            System.out.println("Perimeter of rectangle = " + s1.perimeter(l, b));    
        }
    }
}