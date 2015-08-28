public class SuperKey {

	public static void main(String[] args) {
		Manag m = new Manag("Production");
		System.out.println(m);
		// TODO Auto-generated method stub
		Object o=new Object();
		o.getClass().

	}
}

class Empl {

	int id;
	int age;
	String companyName;
	String address;

	Empl() {
		id = 20;
		age = 23;
		companyName = "Verizon";
		address = "Hyderabad";
	}

	Empl(int age) {
		this();
		this.age = age;
	}

	int getSalary() {
		return 10000;
	}

}

class Manag extends Empl {
	String dept;

	Manag() {
		this.dept = "Marketing";

	}

	Manag(String dept) {
		super(30);
		this.dept = dept;

	}

	@Override
	public String toString() {
		return "Manag [dept=" + dept + ", id=" + id + ", age=" + age
				+ ", companyName=" + companyName + ", address=" + address + "]";
	}

	int getSalary() {
		return super.getSalary() + 10000;
	}
}
