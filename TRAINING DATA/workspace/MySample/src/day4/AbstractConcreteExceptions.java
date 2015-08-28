package day4;
import java.io.*;

//which throwable classes are concrete classes,  which classes are final, which classes are abstract

public class AbstractConcreteExceptions {
	
	public static void main(String[] args) {
		
		
		Throwable t=new Throwable();
		Error r=new Error();
		Exception e=new Exception();
		IOException io=new IOException();
		RuntimeException run=new RuntimeException();
		ClassNotFoundException cls=new ClassNotFoundException();
		CloneNotSupportedException cls2=new CloneNotSupportedException();
		
		
	}
	
}

class test1 extends Throwable{
	
}

class test2 extends Error{
	
}

class test3 extends Exception{
	
}
