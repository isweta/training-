package day4;

public class MyDemo22 {
	
	
	public static void main(String[] args) {
		int i1=5;
		Integer i2=5;//convert int to integer
		int e2=i2.intValue();//convert integer to int
		new Sample().getData(5);
		
	}
	

}
class Sample{
	void getData(Object o){
		Integer i=(Integer)o;
		System.out.println(i);
	}
}
