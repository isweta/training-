package org.mycompany;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee1 {
	String category;
	int age;
	@Autowired
	@Qualifier("addr2")
	Address1 address1;
	//List<Address> addressList;

	public int getAge() {
		return age;
	}

	

	/*public List<Address> getAddressList() {
		return addressList;
	}



	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
*/


	public Address1 getAddress1() {
		return address1;
	}



	public void setAddress1(Address1 address1) {
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
		/*Iterator<Address> it=addressList.iterator();
		while(it.hasNext()){
			Address temp=it.next();
			System.out.println("Address1 : "+temp.doorno+" city : "+temp.city);
		}
		*/
		System.out.println("Address is: "+ address1.doorno+" city :"+address1.city);
	}

	public Employee1(String category) {
		super();
		this.category = category;
	}
	
	public Employee1(int age) {
		super();
		this.age = age;
	}

	public Employee1(String category, int age) {
		super();
		this.category = category;
		this.age = age;
	}

}
