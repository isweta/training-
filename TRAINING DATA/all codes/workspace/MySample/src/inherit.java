public class inherit {

	public static void main(String[] args) {

		/*Employee3 e = new Employee3();
		e.getSalary();
		Manager m = new Manager();
		m.getSalary();*/
		//Employee3 e=new Manager();
		//e.getSalary();
		
	}

}

class Employee3 {

	int age;
	int id;
	String name;
	String companyName;
	String address;

	 static void getSalary() {
		System.out.println("Saalry of empl is 20000");
	}

}

class Manager extends Employee3 {

	 static void getSalary() {
		System.out.println("Salary of manager is 50000");
	}
}
