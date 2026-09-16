
public class Rectangle {
	float l;
	float b;
	Rectangle(float length,float breadth){
		l=length;
		b=breadth;
	}
	void area() {
		float A=l * b;
		System.out.println("Area of the rectangle is : " + A);
	}


	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle(4,5);
		obj.area();
		Rectangle obj1 = new Rectangle(5,8);
		obj1.area();
	}

}
