//Using the concept of abstract class, write a Java program that calculates the area and perimeters of circle, triangle, square and rectangle.
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
        return 2f * 3.142f * radius;
    }
}

class triangle extends shape{
    float a, b, c;

    triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    float area(){
        float s = (a + b + c)/2f;
        return (float)Math.sqrt(s * (s - a) * (s - b) * ( s - c));
    }

    float perimeter(){
        return a + b + c;
    }
}

class square extends shape{
    float side;

    square(float side){
        this.side = side;
    }

    float area(){
        return side * side;
    }

    float perimeter(){
        return 4f * side;
    }
}

class rectangle extends shape{
    float length;
    float height;

    rectangle(float length, float height){
        this.length = length;
        this.height = height;
    }

    float area(){
        return length * height;
    }

    float perimeter(){
        return 2f * (length + height);
    }
}

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c for circle, t for triangle, s for square and r for rectangle:");
        char choice = sc.next().charAt(0);
        if(choice == 'c'){
            System.out.print("Enter the radius of the circle: ");
            float radius = sc.nextFloat();
            circle c = new circle(radius);
            System.out.println("Area: " + c.area() + " and Perimeter: " + c.perimeter());
        }else if(choice == 't'){
            System.out.print("Enter the 3 sides of the triangle: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            triangle t = new triangle(a, b, c);
            System.out.println("Area: " + t.area() + " and Perimeter: " + t.perimeter());
        }else if(choice == 's'){
            System.out.print("Enter the side of the square: ");
            float side = sc.nextFloat();
            square s = new square(side);
            System.out.println("Area: " + s.area() + " and Perimeter: " + s.perimeter());
        }else if(choice == 'r'){
            System.out.print("Enter the length and height: ");
            float length = sc.nextFloat();
            float height = sc.nextFloat();
            rectangle r = new rectangle(length, height);
            System.out.println("Area: " + r.area() + " and Perimeter: " + r.perimeter());
        }else{
            System.out.println("Invalid choice");
        }
    }    
}