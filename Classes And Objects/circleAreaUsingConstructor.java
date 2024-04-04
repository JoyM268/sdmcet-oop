//Program to find the area of circle and initialize the radius using constructor
class circle2{
	float radius;
	
	/* circle2(){
	    this.radius=0.0f;
	} */
	
	circle2(float radius){
		this.radius = radius;
	}
	float area() {
		return 3.142F * radius * radius;
	}
}

public class circleAreaUsingConstructor {
	public static void main(String[] args) {
		circle2 c2 = new circle2(4.5f);
        System.out.println("area of circle = " + c2.area());
	}
}