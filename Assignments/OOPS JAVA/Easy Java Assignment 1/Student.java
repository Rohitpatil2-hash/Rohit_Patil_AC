
public class Student {
	        String name;
			int rollno;
			String phone_no;
			String address;
			

			public static void main(String[] args) {
				Student obj = new Student();
				System.out.println("condition a");
				obj.name="John";
				obj.rollno=2;
				System.out.println("name is : "+ obj.name);
				System.out.println("name is : "+ obj.rollno);
				System.out.println("---------------------------------------------------");
				Student obj1 = new Student();
				obj1.name="Sam";
				obj1.rollno=10;
				obj1.phone_no = "1234509876";
				obj1.address="Nashirabad";
				
				Student obj2 = new Student();
				obj2.name="John";
				obj2.rollno=20;
				obj2.phone_no = "9087563412";
				obj2.address="Jalogoan";
				System.out.println("1st student");
				System.out.println("name is : "+obj1.name  );
				System.out.println("rollno is : "+obj1.rollno  );
				System.out.println("phone number is : "+obj1.phone_no  );
				System.out.println("address is : "+obj1.address  );
				System.out.println("---------------------------------------------------");
				System.out.println("2nd student");
				System.out.println("name is : "+obj2.name  );
				System.out.println("rollno is : "+obj2.rollno  );
				System.out.println("phone number is : "+obj2.phone_no  );
				System.out.println("address is : "+obj2.address  );
				System.out.println("---------------------------------------------------");
			}
}
	