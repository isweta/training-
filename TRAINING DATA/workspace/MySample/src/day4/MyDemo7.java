package day4;

//creating own exception class

public class MyDemo7 {
	
	public static void main(String[] args) {
		try{
			throw new MinBalanceException();
		}catch(MinBalanceException e){
			System.out.println("Min Balance Crossed");
		}
		
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