package day3;

public class MyClass {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Sweta");
		e.setEmpId(1);
		e.setSalary();
		Manager m = new Manager("Marketing");
		m.setName("Salman Fariz");
		m.setEmpId(2);
		m.setSalary();
		Clerk c = new Clerk(500, 60);
		c.setName("Raghav");
		c.setEmpId(3);
		c.setSalary();

		System.out.println(e);
		System.out.println(m);
		System.out.println(c);

	}

}

class Employee {
	String name;
	int empId;
	double salary;

	public Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public Employee(){
		this("Anonymous", 0, 0.0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary() {
		this.salary = 30000;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\nEmployee Details: \nName=" + name + "\nEmployee ID="
				+ empId + "\nSalary=Rs. " + salary;
	}

}

class Manager extends Employee {
	String type;

	public Manager(String name, int empId, double salary, String type) {
		super(name, empId, salary);
		this.type = type;
	}
	
	public Manager(String type){
		super();
		this.type=type;
	}

	public void setSalary() {
		super.setSalary();
		this.salary = salary * 2.0;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\nManager Details:\nName=" + name + "\nEmploee ID=" + empId
				+ "\nType=" + type + "\nSalary=Rs. " + salary;
	}
}

class Clerk extends Employee {
	int speed;
	int accuracy;

	public Clerk(String name, int empId, double salary, int speed, int accuracy) {
		super(name, empId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}
	
	public Clerk(int speed, int accuracy){
		super();
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public void setSalary() {
		super.setSalary();
		this.salary = salary / 2.0;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\nClerk details:\nName=" + name + "\nEmployee ID=" + empId
				+ "\nSalary=" + salary + "\nSpeed=" + speed + " wpm\nAccuracy="
				+ accuracy+"%";
	}
}
