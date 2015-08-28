package day4;

public class MyDemo6 {

	public static void main(String[] args) {
		try{
			//System.out.println(3/0);
			throw new ArithmeticException();
			
			
		}catch(ArithmeticException ae){
			
			System.out.println("Error :"+ ae.getMessage());//if you dont know the reason you can use it to get the error message
		}
	}
}

//use of throw keyword-----create exception
///by default jvm calls the catch block, creates an object of exception class
//user too can forcefully call the catch block using throw--why? so that program specific excepyions can be specified
//for a particular program a name that conatins numbers could be an exception
//so we can  check if the name contains a number and throw an exception 
//for eg. a bank application would need to create an exception when a min balance is reached-- we can create an exception 
//MinBalanceException---- since jvm doesnt know about this exceptio the programmer will have to throw the exception on his own






