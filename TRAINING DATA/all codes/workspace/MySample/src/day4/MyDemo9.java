package day4;

//creating own exception class

public class MyDemo9{
	
	public static void main(String[] args) {
		try{
			//file.open();
			System.out.println(3/0);
			throw new MinBalanceException();
			
		}catch(MinBalanceException e){
			System.out.println("Min Balance Crossed");
		}catch(Exception e){// catch all kinds of exceptions
			System.out.println("Reason for eror: "+e.getMessage());
		}
		catch(Throwable t){}
		finally{
			//file.close();
		}
		System.out.println("program terminated");
		
		//code in finally always exceuted whether or not exception occurs
	}

}

class MinBalanceException extends Exception{
	
	
	
}

