
public class Employee {
	String name;
	int yearjoin;
	String salary;
	String address;
	

	public static void main(String[] args) {
		System.out.println("Name       Year of joining        Address");
		Employee obj = new Employee();
		obj.name = "Robert";
		obj.yearjoin = 1994 ;
		obj.address = " 64C- WallsStreat";
		Employee obj1 = new Employee();
		obj1.name = "Sam";
		obj1.yearjoin = 2000 ;
		obj1.address = "  68D- WallsStreat";
		Employee obj2 = new Employee();
		obj2.name = "John";
		obj2.yearjoin = 1999 ;
		obj2.address = "  26B- WallsStreat";
		System.out.println((obj.name)+ "        "+(obj.yearjoin)+ "         "+(obj.address));
		System.out.println((obj1.name)+"          "+(obj1.yearjoin)+"         "+(obj1.address));
		System.out.println((obj2.name)+"          "+(obj2.yearjoin)+"         "+(obj2.address));
	}

}
