
public class CouplingDemo {
	public static void main(String[] args) {
		Department d=new Department(new Manager());
	}
	
}


class Department{
	//Manager m; //tight coupling
	Employee e; //loose coupling
	//Employee e=new Manager(); //the programmer using the program wouldnt know which onject intiiaised
	public Department(Employee e) {
		this.e=e;
	}
	
	void setEmployee(Employee e){
		this.e=e;
	}
	
	void initEmployee(Employee e){
		this.e=e;
	}
}

class Employee{}

class Manager extends Employee{}

class Programmer extends Employee{}

class Analyst extends Employee{}
