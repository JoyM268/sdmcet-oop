//Demonstrate the declaration and initialization of arrays
class arrayInit {
	public static void main(String args[]) {
		int a[] = new int[5]; //Declaration and instantiation of array
		a[0] = 10; //Initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

		//Traversing the array
		for (int i = 0; i < a.length; i++) //length is a property of the array
			System.out.println(a[i]);
	}
}