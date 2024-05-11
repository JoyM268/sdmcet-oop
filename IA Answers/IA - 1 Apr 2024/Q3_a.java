/* Using the concept of abstract class, write Java program that calculates the area and perimeters of circle and triangle. 
The program should read inputs from the keyboard */
import java.util.Scanner;

abstract class shape{
    abstract float area();
    abstract float perimeter();
}

class circle extends shape{
    float radius;

    circle(float radius){
        this.radius = radius;
    }

    float area(){
        return 3.142f * radius * radius;
    }

    float perimeter(){
        return 2 * 3.142f * radius;
    }
}

class triangle extends shape{
    float a;
    float b;
    float c;

    triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    float area(){
        float s = (a + b + c)/2;
        return (float)Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    float perimeter(){
        return a + b + c;
    }
}

class Q3_a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter c for circle or t for triangle: ");
        char choice = sc.next().charAt(0);
        if(choice == 'c'){
            System.out.print("Enter the radius of circle: ");
            float radius = sc.nextFloat();
            circle c = new circle(radius);
            System.out.println("The area is " + c.area() + " and perimeter is " + c.perimeter());
        }else if(choice == 't'){
            System.out.println("Enter the 3 sides of triangle: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            triangle t = new triangle(a, b, c);
            System.out.println("The area is " + t.area() + " and perimeter is " + t.perimeter());

        }else{
            System.out.println("Invalid choice");
        }
    }
}