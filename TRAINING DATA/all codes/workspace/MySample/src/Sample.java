
public class Sample {
	
	public static void main(String[] args) {
		Test t=new Test();
		t.go();
	}

}

class Test{
	int age;
	static int count;
	
	void go(){
		int i=5;
		System.out.println("local variable "+i);
		System.out.println("instance variable "+age);
		System.out.println("static variable "+count);
	}
}
