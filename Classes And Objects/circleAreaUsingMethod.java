//Program to find the area of circle and initialize the radius using method(setter)
class circle1{
	float radius;
	
	void setRadius(float radius) {
		this.radius = radius;
	}

	float area() {
		return 3.142F * radius * radius;
	}
}

class circleAreaUsingMethod {
	public static void main(String[] args) {
		circle1 c1 = new circle1();
		c1.setRadius(5.5f);
		System.out.println("area of circle = " + c1.area());
	}
}