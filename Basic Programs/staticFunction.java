//Program to show use of static keyword in java
class A{
	void f1() {
		System.out.println("Inside f1");
	}
	static void f2() {
		System.out.println("Inside f2");
	}
}

public class staticFunction {
	public static void main(String[] args) {
		A a1 = new A();
		a1.f1();
		A.f2();
	}
}