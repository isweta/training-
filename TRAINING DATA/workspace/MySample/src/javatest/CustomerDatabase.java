package javatest;

import java.util.HashMap;
import java.util.HashSet;

public class CustomerDatabase {

	static HashMap<Integer, Customer> allCust = new HashMap<Integer, Customer>();

	// database in which customers are stored, key being custid;

	public static void addCust(Customer c) {
		allCust.put(c.custNo, c);
	}

	public static Customer getCust(int cid) {
		return allCust.get(cid);
	}

}

abstract class Customer {
	int custNo;
	String custName;
	int speed;
	int downloadLimit;
	int currentUsage;
	int balanceLeft;

	public void displayDetails() {
		System.out.println("Customer details: " + this.toString());

	}

	public Customer(int custNo, String custName) {

		this.custNo = custNo;
		this.custName = custName;

	}

	@Override
	public String toString() {
		return " Customer [custNo=" + custNo + ", custName=" + custName
				+ ", speed=" + speed + ", downloadLimit=" + downloadLimit
				+ ", currentUsage=" + currentUsage + ", balanceLeft="
				+ balanceLeft;
	}

}

class DatacardCustomer extends Customer {
	int dongleID;

	public DatacardCustomer(int custNo, String custName, int dongleID) {
		super(custNo, custName);
		this.speed = 500;
		this.downloadLimit = 70;
		this.currentUsage = 0;
		this.balanceLeft = 70;
		this.dongleID = dongleID;
	}

	public DatacardCustomer(int custNo, String custName, int speed,
			int downloadLimit, int dongleID) {
		super(custNo, custName);
		this.speed = speed;
		this.downloadLimit = downloadLimit;
		this.currentUsage = 0;
		this.balanceLeft = downloadLimit;
		this.dongleID = dongleID;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Dongle ID=" + dongleID);

	}

	@Override
	public String toString() {
		return "DatacardCustomer " + super.toString() + " dongleID=" + dongleID
				+ "]";
	}

}

class WirelessCustomer extends Customer {
	int accesPointID;

	public void displayDetails() {
		super.displayDetails();
		System.out.println("accessPointID=" + accesPointID);

	}

	public WirelessCustomer(int custNo, String custName, int accessPointID) {
		super(custNo, custName);
		this.speed = 500;
		this.downloadLimit = 120;
		this.currentUsage = 0;
		this.balanceLeft = 120;
		this.accesPointID = accessPointID;
	}

	public WirelessCustomer(int custNo, String custName, int speed,
			int downloadLimit, int accesPointID) {
		super(custNo, custName);
		this.speed = speed;
		this.downloadLimit = downloadLimit;
		this.currentUsage = 0;
		this.balanceLeft = downloadLimit;
		this.accesPointID = accesPointID;
	}

	@Override
	public String toString() {
		return "WirelessCustomer: " + super.toString() + " accesPointID="
				+ accesPointID + "]";
	}

}
