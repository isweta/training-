import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
	public static void main(String[] args) {
		Set<Employee> ts=new TreeSet<Employee>();
		Employee e1=new Employee(101, 22, 20000);
		Employee e2=new Employee(101, 22, 20000);
		Employee e3=new Employee(102, 22, 30000);
		Employee e4=new Employee(103, 22, 15000);
		Employee e5=new Employee(106, 29, 15000);
		ts.add(e1);ts.add(e2);ts.add(e3);ts.add(e4);ts.add(e5);
		
		System.out.println(ts);
	}
	
	
	
}