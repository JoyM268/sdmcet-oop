package p1;

public class child1 extends parent{
	public child1(){
		System.out.println("\nInside pkg and subclass");
		//System.out.println("Private number: " + pri);
		//Private data member is inaccessible
		System.out.println("Protected number: " + pro);
		System.out.println("Public number: " + pub);
	}
}