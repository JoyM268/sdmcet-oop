//Usage of length property and getClass() method in array
class hello {
	public static void main(String[] args) {
		//Declaration and instantiation of array
		int[] iArr;
		iArr = new int[10];
		//or
		//int[] iArr = new int[10];
		System.out.println(iArr.length);
		System.out.println(iArr.getClass());
		System.out.println(iArr.getClass().getSuperclass());
	}
}