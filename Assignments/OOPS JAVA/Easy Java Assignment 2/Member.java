
public class Member {
	String Name;
	int Age;
	String Phone_number ;
	String Address;
	int Salary;
	
	void  takeInput() {
		System.out.println("Enter the Name");
		 this.Name = ConsoleInput.adn();
		System.out.println("Enter the Age");
		 this.Age = ConsoleInput.getInt();
		System.out.println("Enter the Phoe number");
		this.Phone_number = ConsoleInput.adn();
		System.out.println("Enter the address");
		this.Address = ConsoleInput.adn();
		System.out.println("Enter the salary");
		this.Salary = ConsoleInput.getInt();
		}
	void printSalary() {
	System.out.println("the salary of the member is : " + Name);
	System.out.println("the salary of the member is : " + Age);
	System.out.println("the salary of the member is : " + Phone_number);
	System.out.println("the salary of the member is : " + Address);
	System.out.println("the salary of the member is : " + Salary);
	}

	public static void main(String[] args) {
		Member obj = new Member();
		obj.takeInput();
		obj.printSalary();
		
	}

}
