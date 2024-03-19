package p2;

import p1.*;

public class child2 extends parent{
	public child2(){
		System.out.println("\nOutside pkg and subclass");
		//System.out.println("Private number: " + pri);
		//private data member is inaccessible
		//System.out.println("Default number: " + d");
		//default data member is inaccessible
		System.out.println("Protected number: " + pro);
		System.out.println("Public number: " + pub);
	}
}