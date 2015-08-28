package day4;

//demo of try catch
//before terminating program do something useful

public class MyDemo5 {

		public static void main(String[] args) {
			try{
				System.out.println(3/0);
				System.out.println("Print me");//this line not reached
			}catch(ArithmeticException ae){
				System.out.println("Invalid input...terminating program.....");
				System.out.println("Error :"+ ae.getMessage());//if you dont know the reason you can use it to get the error message
			}catch(ArrayIndexOutOfBoundsException aio){
				System.out.println("Arrya Limits crossed");
			}
			System.out.println("Program Completed");
			System.out.println(5+2);
			
		}
}

//if line 10 would not have thrown an exception, program executes till line 11 and skips the catch blocks and executes line 17
//since, exception thrown in line 10, line 11 skipped and catch block exceuted after matchinf type of exception
///any no of catch blocks can be there
//if no catch block matches control given to JVM, JVM prints message
//catch block is like a function, receives the exception as paramter


