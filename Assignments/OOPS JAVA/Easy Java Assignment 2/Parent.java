
public class Parent {
	void display() {
		System.out.println("This is parent class");
	}
	
	public static void main(String[] args) {
		Parent obj = new Parent ();
		obj.display();
		Child obj1= new Child();
		obj1.display1();
		obj1.display();

	}

}
class Child extends Parent{
	void display1() {
		System.out.println( "This is child class");
	}
}