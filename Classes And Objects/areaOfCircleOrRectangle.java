//Program to find the area of a circle or a rectangle using function overloading
import java.util.Scanner;

class shapeArea {

    float area(float radius){
        return 3.142f * radius * radius;
    }

    float area(float length, float breadth){
        return length * breadth;
    }
}

public class areaOfCircleOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape(c for circle or r for rectangle): ");
        char shape = sc.next().charAt(0);
        switch(shape){
            case 'c', 'C' -> {
                System.out.print("Enter the radius: ");
                float radius = sc.nextFloat();
                shapeArea square = new shapeArea();
                System.out.println("The area of circle is " + square.area(radius));
            }

            case 'r', 'R' -> {
                System.out.print("Enter the length: ");
                float length = sc.nextFloat();
                System.out.print("Enter the breadth: ");
                float breadth = sc.nextFloat();
                shapeArea rectangle = new shapeArea();
                System.out.println("The area of circle is " + rectangle.area(length, breadth));               
            }

            default -> System.out.println("Invalid shape");
        }
    }
}