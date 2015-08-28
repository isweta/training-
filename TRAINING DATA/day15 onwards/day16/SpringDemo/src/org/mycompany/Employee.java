package org.mycompany;

public class Employee {
	String category;
	int age;
	Address address1;

	public int getAge() {
		return age;
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void details(){
		System.out.println("I'm working for my company");
		System.out.println("I'm a "+category+" Employee");
		System.out.println("I'm a "+category+" Employee and my age is : "+age);
		System.out.println("Address1 : "+address1.doorno+" city : "+address1.city);
	}

	public Employee(String category) {
		super();
		this.category = category;
	}
	
	public Employee(int age) {
		super();
		this.age = age;
	}

	public Employee(String category, int age) {
		super();
		this.category = category;
		this.age = age;
	}

}
