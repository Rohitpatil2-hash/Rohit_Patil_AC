
public class Employee2 {
	int salary;
	float workhours;
	void getinfo(int salary,float workhours){
		this.salary = salary;
	 this.workhours= workhours;
		}
	void addSal() {
		if (salary < 500) {
			salary = salary + 10;
		}
		}
	void addWork() {
		if (workhours > 6) {
			salary = salary + 5;
		}
		}
	void display() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee2 obj = new Employee2();
		obj.getinfo(440,7.5f);
		obj.addSal();
		obj.addWork();
		obj.display();
	}

}
