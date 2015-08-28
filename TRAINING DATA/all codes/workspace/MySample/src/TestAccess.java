
public class TestAccess {

	

	public static void main(String[] args) {

		Access obj2=new Access();
		Access obj1=new Access();
		//obj1.prop=3;
		obj1.disp(obj2);

	}

	

}

class Access{
	private int prop;
	
	public void disp(Access obj2) {
		obj2.prop=5;
	}
}

class AccessChild extends Access{
	
}
