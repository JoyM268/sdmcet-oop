//Program to find product of two numbers
import java.util.Scanner;

class product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st integer: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd integer: ");
		int b = sc.nextInt();
		System.out.println("Product of " + a + " and " + b + " is = " + (a * b));
	}
}