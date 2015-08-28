package javatest;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Customer c1 = new DatacardCustomer(1, "A", 10025);
		CustomerDatabase.addCust(c1);
		// c1.displayDetails();
		Customer c2 = new WirelessCustomer(2, "B", 265);
		CustomerDatabase.addCust(c2);
		// c2.displayDetails();
		System.out.println("Enter customer id to display details");
		int cid = in.nextInt();
		Customer anyCust = CustomerDatabase.getCust(cid);
		anyCust.displayDetails();

		EnquiryDatabase.makeEnquiry();

		// suppose cust i made an enquiry for type-2 that is download limit
		EnquiryDatabase.getEnquiry(1, 3);
		EnquiryDatabase.getEnquiry(1, 2);
	}

}
