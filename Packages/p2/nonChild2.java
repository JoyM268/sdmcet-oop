package p2;

import p1.*;
public class nonChild2 extends parent {
	parent p12 = new parent();
	public nonChild2(){
		System.out.println("\nOutside pkg and non subclass");
		//System.out.println("Private number: " + p1.pri);
		//Private data member is inaccessible
		//System.out.println("Default number: " + p12.d);
		//Default data member is inaccessible
		//System.out.println("Protected number: " + p12.pro);
		//Protected data member is inaccessible
		//Public data members are only accessible through object of parent
		System.out.println("Public number: " + p12.pub);
	}
}