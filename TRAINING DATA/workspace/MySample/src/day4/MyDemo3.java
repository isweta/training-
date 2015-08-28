package day4;
//call hierarchy of exceptions
//output:
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at day4.Demo.go(MyDemo2.java:15)
//at day4.MyDemo2.main(MyDemo2.java:8)


public class MyDemo3 {
	
	
	
	public static void main(String[] args) {
		Demo1.goLevel1();
	}

}

class Demo1{
	static void goLevel1(){
		DemoLevel2.go();
	}
}

class DemoLevel2{
	static void go(){
		System.out.println(3/0);
		System.out.println("Print message");
	}
}




