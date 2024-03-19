package p1;

public class parent {
	private int pri = 10;
	int d = 20;
	protected int pro = 30;
	public int pub = 40;
	
	public parent(){
		System.out.println("\nInside parent class");
		System.out.println("Private number: " + pri);
		System.out.println("Default number: " + d);
		System.out.println("Protected number: " + pro);
		System.out.println("Public number: " + pub);
	}
}