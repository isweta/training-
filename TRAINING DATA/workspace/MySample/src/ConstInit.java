public class ConstInit {

	public static void main(String[] args) {

		// Constructor overloading
		Employee2 e = new Employee2();
		Employee2 e2 = new Employee2(22, 2, "Apsa");

		// Method Overriding
		System.out.println(e2);

		// Method Overloading
		System.out.println(e.getSalary());
		System.out.println(e2.getSalary(10));

		// Inheritance
		Manager m = new Manager();
		System.out.println(m.companyName);
		System.out.println(m.address);

	}

}

class Employee2 {

	int age;
	int id;
	String name;
	String companyName;
	String address;

	Employee2() {

		companyName = "Verizon";
		address = "Verizon";
	}

	Employee2(int age, int id, String name) {
		this();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee2 [age=" + age + ", id=" + id + ", name=" + name
				+ ", companyName=" + companyName + ", address=" + address + "]";
	}

	int getSalary() {
		return 20000;
	}

	int getSalary(int overtime) {
		return 20000 + (overtime * 100);
	}

}

class Manager extends Employee2 {

}
