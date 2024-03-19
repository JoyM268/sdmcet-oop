package p1;

public class nonChild1 {
	parent p1 = new parent();
	public nonChild1(){
		System.out.println("\nInside pkg and non subclass");
		//System.out.println("Private number: " + p1.pri);
		//Private data member is inaccessible
		//Other data members are only accessible through object of parent
		System.out.println("Default number: " + p1.d);
		System.out.println("Protected number: " + p1.pro);
		System.out.println("Public number: " + p1.pub);
	}
}