package day11;

import java.util.HashSet;
import java.util.Set;

public class TestHash {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, 22, 20000);
		Employee e2 = new Employee(102, 22, 22000);
		Employee e3 = new Employee(103, 23, 30000);
		Employee e4 = new Employee(102, 22, 22000);
		Set<Employee> nameSet = new HashSet<Employee>();
		nameSet.add(e1);
		nameSet.add(e2);
		nameSet.add(e3);
		nameSet.add(e4);
		System.out.println(nameSet);

		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(2);
		System.out.println(intSet);
		
		Set<String> Stringset=new HashSet<String>();
		String s1="abc";
		String s2="abc";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		Stringset.add(s1);
		Stringset.add(s2);
		System.out.println(Stringset);
		System.out.println(Stringset.remove(s1));
		System.out.println(Stringset);
	}
}

class Employee {
	int empid;
	int age;
	int salary;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int empid, int age, int salary) {
		super();
		this.empid = empid;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", age=" + age + ", salary="
				+ salary + "]";
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + empid;
		result = prime * result + salary;
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (empid != other.empid)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

}
