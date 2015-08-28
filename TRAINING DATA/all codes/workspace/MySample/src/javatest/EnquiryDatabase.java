package javatest;

//can enquire for speed , Download limit , current usage , balance left
//enquiries searchable by specifying enq id or by specifying customer id and enq type

import java.util.*;

public class EnquiryDatabase {
	// enquiries stored in hashmap, hashed by key enqid

	static HashMap<Integer, Enquiry> allEnq = new HashMap<Integer, Enquiry>();

	public static void addEnquiry(Enquiry e) {
		allEnq.put(e.enqId, e);
	}

	public static Enquiry getEnquiry(int enqId) {
		return allEnq.get(enqId);
	}

	public static void getEnquiry(int custId, int enqType) {

		for (Integer enqId : allEnq.keySet()) {
			if (allEnq.get(enqId).cust.custNo == custId
					&& allEnq.get(enqId).enqType == enqType) {
				System.out.println(allEnq.get(enqId));
				return;
			}
		}

		System.out.println("Such an enquiry not found");

	}

	public static void makeEnquiry() {
		System.out.println("Making an enquiry");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your custId :");
		int custId = in.nextInt();
		System.out
				.println("To know your speed press 1 , Download limit-2 , current usage-3 , balance left-4");
		int enqType = in.nextInt();
		int enqId = (int) Math.random() * 1000;
		Enquiry enq = new Enquiry(enqId, custId, enqType);
		allEnq.put(enqId, enq);
		enq.processEnquiry();

	}

}

class Enquiry {
	int enqId;
	Customer cust;
	int enqType;

	public void processEnquiry() {
		System.out.println("For customer with id " + cust.custNo + " , name "
				+ cust.custName);
		switch (enqType) {
		case 1:
			System.out.println("Speed is " + cust.speed + " Mbps");
			break;
		case 2:
			System.out.println("Download Limit is " + cust.downloadLimit
					+ " Gb");
			break;
		case 3:
			System.out.println("Current Usage is " + cust.currentUsage + " Gb");
			break;
		case 4:
			System.out.println("Balance Left is " + cust.balanceLeft);

		}

	}

	public Enquiry(int enqId, int custId, int enqType) {
		Customer cust = CustomerDatabase.getCust(custId);
		this.cust = cust;
		this.enqType = enqType;

		this.enqId = enqId;
	}

	@Override
	public String toString() {
		return "Enquiry [enqId=" + enqId + ", cust=" + cust + ", enqType="
				+ enqType + "]";
	}

}
