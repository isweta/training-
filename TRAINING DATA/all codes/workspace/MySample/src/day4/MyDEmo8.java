package day4;

//creating own exception class

public class MyDEmo8{
	
	public static void main(String[] args) {
		try{
			throw new MinBalanceException();
		}catch(MinBalanceException e){
			System.out.println("Min Balance Crossed");
		}catch(Exception e){// catch all kinds of exceptions
			System.out.println("Reason for eror: "+e.getMessage());
		}
		catch(Throwable t){}
		
		//cathc can only take parameters of thrpwable type
		
	}

}

class MinBalanceException extends Exception{
	
	
	
}

//separate error handling code fro regualr code otherwise the code is very messy
/*if(fileopens)
		determine length
		if(gotFileLEngth){
			alllocate that much memeory;
			if(got enough memory){
				
			}
			else{
				error=3;
			}
			else{
				error=4}
			}
		}
*/