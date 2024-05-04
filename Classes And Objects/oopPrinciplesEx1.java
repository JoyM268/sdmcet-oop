//Program to implement inheritence
class person{
	String name;
	int age;

	person(String name, int age){
		this.age = age;
		this.name = name;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

class employee extends person{
	float salary;

	employee(String name, int age, float salary){
		super(name, age);
		this.salary = salary;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
	}
}

class oopPrinciplesEx1 {
	public static void main(String[] args) {
		person p = new employee("abc", 21, 45000.00F);
		System.out.println("DMD: base object is for child constructor");
		p.display();

		employee e = new employee("xyz", 20, 4000.0F);
		System.out.println("\nDMD: child object is for its own constructor");
		e.display();

		System.out.println("\nDMD: base object is for its own constructor");
		person p1 = new person("pqr", 18);
		p1.display();

		//Not allowed:
		//employee e1 = new person("xyz", 20);
		//System.out.println("\nDMD: child object is for base constructor");
		//e1.display();
	}
}