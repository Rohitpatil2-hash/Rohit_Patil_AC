package company;

public class Engineer extends Employee{
	float overtime;
	
	
	
	public void engineerdetails(){
	System.out.println("Enter the name : ");
	name=Consoleinput.adn();
	System.out.println("Enter the address : ");
	address=Consoleinput.adn();
	System.out.println("Enter the age : ");
	age=Consoleinput.getInt();
	System.out.println("Enter the gender in form [M/F] : ");
	gender=Consoleinput.adn();
	System.out.println("Enter the basic salary : ");
	basicsalary=Consoleinput.getfloat();
	System.out.println("Enter the overtime hours : ");
	overtime=Consoleinput.getfloat();
	}
public void eDisplay() {
	System.out.println("Name : " + name);
	System.out.println("Address : " + address);
	System.out.println("Age : " + age);
	System.out.println("Gender : " + gender);
	System.out.println("Basicsalary : " + basicsalary);
	System.out.println("overtime hour : " + overtime);
}

}
	
	
	
	
	


