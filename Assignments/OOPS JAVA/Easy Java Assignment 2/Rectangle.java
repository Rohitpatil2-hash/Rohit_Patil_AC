
public class Rectangle {
	int length;
	int breadth;
	Rectangle (int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		
		System.out.println("Area is : " + (length * breadth));
		}
	void perimeter() {
		
		System.out.println("Periometer is : "+ (length+length+breadth+breadth));
		}

	public static void main(String[] args) {
	Rectangle obj = new Rectangle(10,7);
	obj.area();
	obj.perimeter();
	Square obj2 = new Square(5);
	obj2.AREA();
	obj2.PERIMETER();

	}

}
 class Square extends Rectangle{
	int side;
	
	Square(int side){
		super(side,side);
		this.side=side;
		
		
	}
	void AREA() {
		System.out.println("area of square : "+ (side*side));
	}
	void PERIMETER() {
		System.out.println("perimeter of square : "+ (4*side));
	}
}
