package test;



class VerizonEmployee{
	int eid;
	String name;
	Dependent spouse;
	
	class Dependent{
		String name;
		int age;
		
	}
}

public class InnerDemo {
	public static void main(String[] args) {
		VerizonEmployee vze=new VerizonEmployee();
		//vze.spouse=vze.new Dependent();
		VerizonEmployee.Dependent sps=vze.new Dependent();
		vze.spouse=sps;
		//vze.spouse.age=23;
		//vze.spouse.name="Raghav";
		sps.age=23;
		sps.name="Raghav";
		System.out.println(vze.spouse.age);
	}

}
