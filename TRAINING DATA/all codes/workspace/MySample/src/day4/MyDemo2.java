package day4;
//call hierrachy of exceptions---stack trace----which method which class exception occureed
//output: 
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at day4.Demo.go(MyDemo2.java:15)
//at day4.MyDemo2.main(MyDemo2.java:8)




public class MyDemo2 {
	
	
	
	public static void main(String[] args) {
		Demo.go();
	}

}

class Demo{
	static void go(){
		System.out.println(3/0);
		System.out.println("Print message");
	}
}
