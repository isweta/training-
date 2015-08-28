import java.util.Scanner;

class Employee{
	int eid;
	int age;
	
}

public class ArObj {

	public static void main(String[] args) {
		Employee ar[] = new Employee[3];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {

			
				System.out.println("Enter employee id and age");
				Employee e=new Employee();
				e.eid=s.nextInt();
				e.age=s.nextInt();
				ar[i]=e;

			

		}

		for (Employee i : ar) {
			System.out.println("Employee details (id, age):"+ i.eid+", "+i.age);
			
		}
	}

}
