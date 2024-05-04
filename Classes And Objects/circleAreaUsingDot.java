//Program to find the area of circle and initialize the radius using dot operator 
class circle{
	float radius;

	float area() {
		return 3.142F * radius * radius;
	}
}

class circleAreaUsingDot {
	public static void main(String[] args) {
		circle c1 = new circle();
		c1.radius = 10.5F;
		System.out.println("Area of circle = " + c1.area());
	}
}