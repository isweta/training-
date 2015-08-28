interface BuildingService{
	void buildHouse();
	void buildComplex();
	void buildMall();
}

class Client{
	void requestToBuildHouse(BuildingService bs){
		bs.buildHouse();
	}
}

class DLF implements BuildingService{
	public void buildHouse(){
		System.out.println("Luxury houses");
	}
	public void buildComplex(){
		System.out.println("Luxury complex");
	}
	public void buildMall(){
		System.out.println("Luxury mall");
	}
}

class LNT implements BuildingService{
	public void buildHouse(){
		System.out.println("Traditional houses");
	}
	public void buildComplex(){
		System.out.println("Modern complex");
	}
	public void buildMall(){
		System.out.println("Shopping mall");
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
