package org.mycompany;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("employee1")
public class Employee {
	
	@Autowired
	Address address1;
	
	

	/*public List<Address> getAddressList() {
		return addressList;
	}



	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
*/


	public Address getAddress() {
		return address1;
	}



	public void setAddress(Address address1) {
		this.address1 = address1;
	}



	

	public void details(){
		System.out.println("I'm working for my company");
		
		/*Iterator<Address> it=addressList.iterator();
		while(it.hasNext()){
			Address temp=it.next();
			System.out.println("Address1 : "+temp.doorno+" city : "+temp.city);
		}
		*/
		System.out.println("Address is: "+ address1.doorno+" city :"+address1.city);
	}

	

}
