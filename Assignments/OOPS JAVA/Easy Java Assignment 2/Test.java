public class Test{
	public static void main(String[] args) {
		Square obj = new Square ();
        obj.display();
        obj.display1();
	}
}

class Shape {
	void display() {
		System.out.println("This is shape");
	}
}
  class Rectangle extends Shape{
	void display1() {
		System.out.println("This is rectangular shape");
	}
}
  class Circle extends Shape {
	 void display2() {
		 System.out.println("This is circular shape"); 
	 }
 }
 class Square extends Rectangle{
	void display3() {
		System.out.println("Square is a rectangle");
	}
}























