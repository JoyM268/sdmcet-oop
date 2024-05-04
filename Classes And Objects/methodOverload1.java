//Program to show the use of method overloading
import java.util.Scanner;

class areas{
	float area(float r) {
		return 3.142F * r * r;
	}
	
	float area(float l, float b) {
		return l * b;
	}
}

class methodOverload1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		areas a1 = new areas();
		
		System.out.println("c for circle and r for rectangle");
		System.out.println("Enter choice:");
		char choice = sc.next().charAt(0);
		
		switch(choice) {
		case 'c':
		case 'C':
			System.out.println("Enter radius: ");
			float r=sc.nextFloat();
			System.out.println("Area of circle = " + a1.area(r));
			break;
			
		case 'r':
		case 'R':
			System.out.println("Enter length: ");
			float l=sc.nextFloat();
			System.out.println("Enter breadth: ");
			float b=sc.nextFloat();
			System.out.println("Area of rectangle = " + a1.area(l,b));
			break;
		}
	}
}