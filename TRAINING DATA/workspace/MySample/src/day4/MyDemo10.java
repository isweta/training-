package day4;

//creating own exception class

public class MyDemo10 {

	public static void main(String[] args) {
		try {
			return;
			
			/*output when return is commented out
					Finally executed
					program terminated
			output when return ststaemet is there
					Finally executed*/
					

		} catch (Exception e) {// catch all kinds of exceptions
			System.out.println("Reason for eror: " + e.getMessage());
		} finally {
			System.out.println("Finally executed");
		}
		System.out.println("program terminated");

		
	}

}

