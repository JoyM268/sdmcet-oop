//Program to find area of triangle and also use setters
import java.util.Scanner;

class triangle{
    float base;
    float height;

    float area(float base, float height){
        this.base = base;
        this.height = height;

        return 0.5f * this.base * this.height;
    }
}

class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height: ");
        float height = sc.nextFloat();
        triangle t = new triangle();
        System.out.println("Area of triangle is " + t.area(base, height));
    }
}