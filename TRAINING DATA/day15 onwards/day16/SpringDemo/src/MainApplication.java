
public class MainApplication {

	public static void main(String[] args) {
		//Datasource ds=JNDI.lookup("datasource");
		Department d=new Department(new Manager);//spring--even here no need to passmanager
		
	}

}


class Department{
	Employee e;
	Department(Employee e){
		this.e=e;
		//this.e=JNDI.lookup("employee"); makes code somewhat tightly coupled
	}
	
	
}

class Employee{}