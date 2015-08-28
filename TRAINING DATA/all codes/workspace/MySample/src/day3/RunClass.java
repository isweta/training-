package day3;

public class RunClass {

	public static void main(String[] args) {
		DayScholar d = new DayScholar(1, "Sweta", 5000.0, 500.0);
		Hosteller h = new Hosteller(2, "Aspa", 5000.0, 2000.0);
		double feePaid;
		d.displayDetails();
		feePaid = 4000;
		System.out.println(d.studName + " has remaining fee Rs. "
				+ d.payFee(feePaid) + " after paying Rs. " + feePaid);
		h.displayDetails();
		feePaid = 3000;
		System.out.println(h.studName + " has remaining fee Rs. "
				+ h.payFee(feePaid) + " after paying Rs. " + feePaid);

	}

}

abstract class Student {
	int studId;
	String studName;
	double examFee;

	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}

	public void displayDetails() {
		System.out.println("\n");
		System.out.println("Student Id: " + studId);
		System.out.println("Student Name: " + studName);
		System.out.println("Total fees: " + calcTotal());
	}

	public abstract double calcTotal();

	public double payFee(double amount) {
		double total = calcTotal();
		double remaining = total - amount;
		return remaining;

	};

}

class DayScholar extends Student {
	double transportFee;

	public DayScholar(int studId, String studName, double examFee,
			double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
	}

	public double calcTotal() {
		return examFee + transportFee;
	}
}

class Hosteller extends Student {
	double hostelFee;

	public Hosteller(int studId, String studName, double examFee,
			double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
	}

	public double calcTotal() {
		return examFee + hostelFee;
	}

}
